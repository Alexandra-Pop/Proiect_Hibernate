package constants;

public class ErrorMessages {
    public static final String LOGIN_ERROR = "LOGIN FAILED! WRONG CREDENTIALS!";
    public static final String REGISTER_ERROR = "REGISTRATION FAILED! THE EMAIL IS ALREADY USED FOR ANOTHER ACCOUNT!";

    public static final String ADD_DOCUMENT_ERROR = "ADDING THE INSERTED DOCUMENT FAILED! THE DOCUMENT WITH THIS TYPE AND DESCRIPTION ALREADY EXISTS!";
    public static final String DELETE_DOCUMENT_ERROR = "DELETING THE SELECTED DOCUMENT FAILED!";

    public static final String FORMAT_ERROR = "WRONG FIELD FORMATS!";
    public static final String EMPTY_STRINGS_ERROR = "FIELDS ARE EMPTY!";

    public static final String ADD_RESIDENCE_ERROR = "ADDING THE INSERTED RESIDENCE FAILED! THE RESIDENCE ALREADY EXISTS!";
    public static final String DELETE_RESIDENCE_ERROR = "DELETING THE RESIDENCE FAILED!";

    public static final String ADD_REQUEST_ERROR = "ADDING THE INSERTED REQUEST FAILED! ALREADY SUCH A REQUEST ON THIS DATE OR YOU HAVE REACHED THE LIMIT OF 3 REQUEST TYPES IN A YEAR";
    public static final String DELETE_REQUEST_ERROR = "DELETING THE SELECTED REQUEST FAILED!";
    public static final String ACCEPT_REQUEST_ERROR = "ACCEPTING THE SELECTED REQUEST FAILED!";
    public static final String UPDATE_REQUEST_ERROR = "UPDATING THE SELECTED REQUEST FAILED! ALREADY SUCH A REQUEST ON THIS DATE!";
}
