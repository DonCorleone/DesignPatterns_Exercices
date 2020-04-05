package com.codewithmosh.mediator;

public class SignUpDialogBox {
    TextBox txtUserName;
    TextBox txtPassword;
    CheckBox chkAgree;
    Button btnSignUp;

    SignUpDialogBox(){
        txtUserName = new TextBox();
        txtPassword = new TextBox();
        chkAgree = new CheckBox();
        btnSignUp = new Button();

        txtUserName.addEventHandler(this :: HandleTextFilled);
        txtPassword.addEventHandler(this :: HandleTextFilled);
        chkAgree.addEventHandler(this::HandleTextFilled);
    }

    public void simulateUserInteraction(){

        System.out.println("Set Username");
        txtUserName.setContent("");
        System.out.println("Set Username");
        txtPassword.setContent("");
        System.out.println("Set Agree");
        chkAgree.setChecked(false);

        System.out.println("Set Username");
        txtUserName.setContent("Hoshi");
        System.out.println("Set Username");
        txtPassword.setContent("Root");
        System.out.println("Set Agree");
        chkAgree.setChecked(true);
    }

    private void HandleTextFilled(){
        var userName = txtUserName.getContent();
        var userNameEmtpy = userName == null || userName.isEmpty();

        var passWord = txtPassword.getContent();
        var passWordEmpty = passWord == null ||passWord.isEmpty();

        var agree = chkAgree.isChecked();

        btnSignUp.setEnabled(!userNameEmtpy && !passWordEmpty && agree);
    }
}
