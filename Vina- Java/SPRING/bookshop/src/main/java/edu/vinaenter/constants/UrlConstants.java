package edu.vinaenter.constants;


public class UrlConstants {

	public static final String URL_PUBLIC_INDEX = "/home";
	
    public static final String URL_PUBLIC_HOME_PAGINATION = "/home/{page}";
    
    public static final String URL_PUBLIC_CAT = "/cat/{name}-{id}";
    
    public static final String URL_PUBLIC_DETAIL = "/detail/{name}-{id}";
    
    public static final String URL_PUBLIC_CONTACT = "/contact";
    
    public static final String URL_PUBLIC_SEARCH = "/search";
    
    public static final String URL_ADMIN = "/admin";
    public static final String URL_ADMIN_INDEX = "/index";
    public static final String URL_ADMIN_BOOK_INDEX_PAGINATION = "/book/index/{page}";
    
    public static final String URL_ADMIN_CAT_INDEX = "/cat/index";
    public static final String URL_ADMIN_CAT_ADD = "/cat/add";
    public static final String URL_ADMIN_CAT_DEL = "/cat/del/{id}";
    public static final String URL_ADMIN_CAT_EDIT = "/cat/edit/{id}";
    
    public static final String URL_ADMIN_USER_INDEX = "/user/index";
    public static final String URL_ADMIN_USER_ADD = "/user/add";
    public static final String URL_ADMIN_USER_DEL = "/user/del/{id}";
    public static final String URL_ADMIN_USER_EDIT = "/user/edit/{id}";
    
    public static final String URL_ADMIN_BOOK_INDEX = "/book/index";
    public static final String URL_ADMIN_BOOK_ADD = "/book/add";
    public static final String URL_ADMIN_BOOK_EDIT = "/book/edit/{id}";
    public static final String URL_ADMIN_BOOK_DEL = "/book/del/{id}";
    
    public static final String URL_AUTH = "/auth";
    public static final String URL_LOGIN = "/login";
    
    private UrlConstants() {
        throw new InstantiationError("Must not instantiate this class");
    }
}
