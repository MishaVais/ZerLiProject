package Customer;

public class Customer {
private String id;
private String username;
private String firstname;
private String lastname;
private String email;
private String address;
private String creditcard;
private boolean active;


public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getCreditcard() {
	return creditcard;
}

public void setCreditcard(String creditcard) {
	this.creditcard = creditcard;
}

public boolean isActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}
}
