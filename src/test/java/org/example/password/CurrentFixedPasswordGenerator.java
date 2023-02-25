package org.example.password;

import org.example.password.PasswordGenerator;

public class CurrentFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
