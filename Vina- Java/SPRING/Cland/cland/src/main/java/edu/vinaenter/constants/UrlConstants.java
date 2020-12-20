package edu.vinaenter.constants;


public class UrlConstants {

	public static final String URL_CLAND_HOME = "/home";
	
    public static final String URL_CLAND_HOME_PAGINATION = "/home/{page}";
    
    public static final String URL_CLAND_CAT = "/cat/{name}-{id}";
    
    public static final String URL_CLAND_DETAIL = "/detail/{name}-{id}";
    
    public static final String URL_CLAND_CONTACT = "/contact";
    
    public static final String URL_CLAND_SEARCH = "/search";
    
    public static final String URL_ADMIN = "/admin";
    public static final String URL_ADMIN_INDEX = "/index";
    public static final String URL_ADMIN_LAND_INDEX_PAGINATION = "/land/index/{page}";
    
    public static final String URL_ADMIN_CAT_INDEX = "/cat/index";
    public static final String URL_ADMIN_CAT_ADD = "/cat/add";
    public static final String URL_ADMIN_CAT_DEL = "/cat/del/{id}";
    public static final String URL_ADMIN_CAT_EDIT = "/cat/edit/{id}";
    
    public static final String URL_ADMIN_USER_INDEX = "/user/index";
    public static final String URL_ADMIN_USER_ADD = "/user/add";
    public static final String URL_ADMIN_USER_DEL = "/user/del/{id}";
    public static final String URL_ADMIN_USER_EDIT = "/user/edit/{id}";
    
    public static final String URL_ADMIN_LAND_INDEX = "/land/index";
    public static final String URL_ADMIN_LAND_ADD = "/land/add";
    public static final String URL_ADMIN_LAND_EDIT = "/land/edit/{id}";
    public static final String URL_ADMIN_LAND_DEL = "/land/del/{id}";
    
    public static final String URL_AUTH = "/auth";
    public static final String URL_LOGIN = "/login";
    
    private UrlConstants() {
        throw new InstantiationError("Must not instantiate this class");
    }
}
