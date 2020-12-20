
package com.hung.service.impls;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hung.converter.UserConverter;
import com.hung.dto.UserDTO;
import com.hung.entity.RoleEntity;
import com.hung.entity.UserEntity;
import com.hung.repository.RoleRepository;
import com.hung.repository.UserRepository;
import com.hung.security.CustomUserDetails;
import com.hung.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserConverter userConverter;
	
	private Optional<UserEntity> optional;

	@Override
	public List<UserDTO> getAll() {
		List<UserEntity> listEntity = userRepository.findAll();
		return userConverter.toDTO(listEntity);
	}

	@Override
	public UserDTO getById(Long id) {
	    optional = userRepository.findById(id);
		UserEntity entity = optional.get();
		return UserConverter.toDTO(entity);
	}

	@Override
	public UserDTO save(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();

		if (userDTO.getId() != null) {
			optional = userRepository.findById(userDTO.getId());
			UserEntity oldUserEntity = optional.get();
			userEntity = userConverter.toEntity(userDTO, oldUserEntity);
		} else {
			userEntity = userConverter.toEntity(userDTO);
		}

		ArrayList<String> listRole = (ArrayList<String>) userDTO.getRoles();
		ArrayList<RoleEntity> listRoleEntity = new ArrayList<RoleEntity>();
		for (int i = 0; i < listRole.size(); i++) {

			RoleEntity roleEntity = roleRepository.findOneByName(listRole.get(i));
			listRoleEntity.add(roleEntity);
		}

		userEntity.setRoles(listRoleEntity);
		userEntity = userRepository.save(userEntity);
		return UserConverter.toDTO(userEntity);
	}

	@Override
	public void delete(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UserEntity user = userRepository.findOneByName(username);

		if (user == null) {
			throw new UsernameNotFoundException(username);
		}

		return new CustomUserDetails(user);
	}

	@Override
	public boolean hadUser(UserDTO userDTO) {
		if (userRepository.findOneByName(userDTO.getName()) != null) {
			return true;
		}

		return false;
	}

	@Override
	public UserDetails loadUserById(Long id) {
		optional = userRepository.findById(id);
		UserEntity user = optional.get();

		return new CustomUserDetails(user);
	}

}
