// Base class Page
public class Polymorphism {
    public void interactWithButton() {
        // implementation for interacting with a button
    }

    public void interactWithTextField() {
        // implementation for interacting with a text field
    }

    public void interactWithDropdown() {
        // implementation for interacting with a dropdown menu
    }
}

// Subclass LoginPage
class LoginPage extends Polymorphism {
    public void interactWithButton() {
        // specific implementation for interacting with the Login button
    }

    public void interactWithTextField() {
        // specific implementation for interacting with the username and password text fields
    }
}

// Subclass HomePage
class HomePage extends Polymorphism {
    public void interactWithButton() {
        // specific implementation for interacting with the Logout button
    }

    public void interactWithDropdown() {
        // specific implementation for interacting with the user profile dropdown
    }
}
