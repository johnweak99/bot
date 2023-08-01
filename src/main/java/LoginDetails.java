public class LoginDetails {

    public LoginDetails(String client_id, String grant_type, String password, String username, String ux_id) {
        this.client_id = client_id;
        this.grant_type = grant_type;
        this.password = password;
        this.username = username;
        this.ux_id = ux_id;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUx_id() {
        return ux_id;
    }

    public void setUx_id(String ux_id) {
        this.ux_id = ux_id;
    }

    private String client_id;
    private String grant_type;
    private String password;
    private String username;
    private String ux_id;


}
