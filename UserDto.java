package com.example;

public class UserDto {
    private String panNumber;

    public String getPanNumber() {
        return panNumber;
    }

    public static class Builder {
        private String panNumber;

        public Builder panNumber(String value) {
            this.panNumber = value;
            return this;
        }

        public Builder setPanNumber(String value) {
            this.panNumber = value;
            return this;
        }

        public UserDto build() {
            UserDto dto = new UserDto();
            dto.panNumber = panNumber;
            return dto;
        }
    }
}
