public class UnauthenticatedUserException extends Exception
{
    public UnauthenticatedUserException(String username)
    {
        super("User " + username + " is not sufficiently authenticated");
    }
}
