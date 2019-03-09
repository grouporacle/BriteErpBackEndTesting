package utilities;

import pages.CustomersPage;
import pages.HomePage;
import pages.LoginPage;

import java.security.acl.LastOwnerException;

public class Pages {

    private CustomersPage customersPage;
    private HomePage homePage;

    public CustomersPage getCustomersPage() {

            return (customersPage == null) ? customersPage = new CustomersPage() : customersPage;
        }
    public HomePage homePage() {

        return (homePage == null) ? homePage = new HomePage() : homePage;
    }


    }


