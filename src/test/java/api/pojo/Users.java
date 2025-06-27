package api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    private String login;
    public String type;

    public Users() {
    }

    public Users(String login, String type) {
        this.login = login;
        this.type = type;
    }

    public String getLogin() {
        return this.login;
    }

    public String getType() {
        return this.type;
    }


}
