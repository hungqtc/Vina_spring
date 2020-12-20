/*
 * package com.hung.service.impls;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.hung.converter.AddressConverter; import com.hung.dto.AddressDTO;
 * import com.hung.entity.AddressEntity; import com.hung.entity.UserEntity;
 * import com.hung.repository.AddressRepository; import
 * com.hung.repository.UserRepository; import com.hung.service.AddressService;
 * 
 * @Service public class AddressServiceImpl implements AddressService {
 * 
 * @Autowired private AddressRepository addressRepository;
 * 
 * @Autowired private UserRepository userRepository;
 * 
 * @Autowired private AddressConverter addressConverter;
 * 
 * @Override public List<AddressDTO> getAll() { List<AddressEntity> listEntity =
 * addressRepository.findAll(); return addressConverter.toDTO(listEntity); }
 * 
 * @Override public AddressDTO getById(Long id) { AddressEntity entity =
 * addressRepository.getOne(id); return addressConverter.toDTO(entity); }
 * 
 * @Override public AddressDTO save(AddressDTO addressDTO) { AddressEntity
 * addressEntity = new AddressEntity();
 * 
 * if (addressDTO.getId() != null) { AddressEntity oldAddressEntity =
 * addressRepository.findById(addressDTO.getId()); addressEntity =
 * addressConverter.toEntity(addressDTO, oldAddressEntity); } else {
 * addressEntity = addressConverter.toEntity(addressDTO); } UserEntity
 * userEntity = userRepository.findOneByName(addressDTO.getUser());
 * addressEntity.setUser(userEntity); addressEntity =
 * addressRepository.save(addressEntity); return
 * addressConverter.toDTO(addressEntity); }
 * 
 * 
 * @Override public void delete(Long addressId) {
 * addressRepository.deleteById(addressId); } }
 */