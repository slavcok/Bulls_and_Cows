class User {
    private String firstName;
    private String lastName;
    public boolean f = false;
    public boolean l = false;
    public String vysledok;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
            f = true;
        } else {
            this.firstName = "";
        }
  //  System.out.println(firstName);
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
            l = true;
        } else {
            this.lastName = "";
        }
  //  System.out.println(lastName);
    }

    public String getFullName() {
        if (f) {
            vysledok = firstName;
        }
        if (l) {
            vysledok = lastName;
        }
        if (f && l) { 
            vysledok = firstName + " " + lastName;
        }
        if (!(f || l)) { 
            vysledok = "Unknown";
        }


        return vysledok;
    }
}
