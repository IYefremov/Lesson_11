package com.mycompany.app;

class Account {
    private String gender;
    private String firstCustomerName;
    private String lastCustomerName;
    private String pass;
    private String email;
    private String day;
    private String month;
    private String year;
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postcode;
    private String country;
    private String phone_home;
    private String phone_mobile;
    private String alias;

    private Account(BuildAccount buildAccount) {
        this.gender = buildAccount.gender;
        this.firstCustomerName = buildAccount.firstCustomerName;
        this.lastCustomerName = buildAccount.lastCustomerName;
        this.pass = buildAccount.pass;
        this.email = buildAccount.email;
        this.day = buildAccount.day;
        this.month = buildAccount.month;
        this.year = buildAccount.year;
        this.firstName = buildAccount.firstName;
        this.lastName = buildAccount.lastName;
        this.company = buildAccount.company;
        this.address1 = buildAccount.address1;
        this.address2 = buildAccount.address2;
        this.city = buildAccount.city;
        this.state = buildAccount.state;
        this.postcode = buildAccount.postcode;
        this.country = buildAccount.country;
        this.phone_home = buildAccount.phone_home;
        this.phone_mobile = buildAccount.phone_mobile;
        this.alias = buildAccount.alias;
    }

    static class BuildAccount {
        private String gender;
        private String firstCustomerName;
        private String lastCustomerName;
        private String pass;
        private String email;
        private String day;
        private String month;
        private String year;
        private String firstName;
        private String lastName;
        private String company;
        private String address1;
        private String address2;
        private String city;
        private String state;
        private String postcode;
        private String country;
        private String phone_home;
        private String phone_mobile;
        private String alias;


        // Write setters for all fields
        public BuildAccount withCompany(String company) {
            this.company = company;
            return this;
        }

        public BuildAccount withGender(String gender) {
            this.gender = gender;
            return this;
        }

        public BuildAccount withEmail(String email) {
            this.email = email;
            return this;
        }

        public BuildAccount withDay(String day) {
            this.day = day;
            return this;
        }

        public BuildAccount withMonth(String month) {
            this.month = month;
            return this;
        }

        public BuildAccount withYear(String year) {
            this.year = year;
            return this;
        }

        public BuildAccount withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BuildAccount withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BuildAccount withAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public BuildAccount withAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public BuildAccount withFirstCustomerName(String firstCustomerName) {
            this.firstCustomerName = firstCustomerName;
            return this;
        }

        public BuildAccount withLastCustomerName(String lastCustomerName) {
            this.lastCustomerName = lastCustomerName;
            return this;
        }

        public BuildAccount withPass(String pass) {
            this.pass = pass;
            return this;
        }

        public BuildAccount withAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public BuildAccount withCity(String city) {
            this.city = city;
            return this;
        }

        public BuildAccount withState(String state) {
            this.state = state;
            return this;
        }

        public BuildAccount withPostcode(String postcode) {
            this.postcode = postcode;
            return this;
        }

        public BuildAccount withCountry(String country) {
            this.country = country;
            return this;
        }

        public BuildAccount withPhone_mobile(String phone_mobile) {
            this.phone_mobile = phone_mobile;
            return this;
        }

        public BuildAccount withPhone_home(String phone_home) {
            this.phone_home = phone_home;
            return this;
        }

        // Create Account
        public Account build() {
            return new Account(this);
        }
    }

    public String getGender() {
        return gender;
    }

    public String getFirstCustomerName() {
        return firstCustomerName;
    }

    public String getLastCustomerName() {
        return lastCustomerName;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone_home() {
        return phone_home;
    }

    public String getPhone_mobile() {
        return phone_mobile;
    }

    public String getAlias() {
        return alias;
    }
}
