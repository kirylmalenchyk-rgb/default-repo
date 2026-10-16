package com.example;

import org.springframework.http.ResponseEntity;

public class VendorController {

    public ResponseEntity<String> passthrough(ResponseEntity<Object> res) {
        ApiResponse.Builder builder = new ApiResponse.Builder();
        builder.data((String) res.getBody());
        return ResponseEntity.ok(builder.build());
    }

    static class ApiResponse {
        private Object data;

        static class Builder {
            private Object data;

            Builder data(Object value) {
                this.data = value;
                return this;
            }

            ApiResponse build() {
                ApiResponse r = new ApiResponse();
                r.data = data;
                return r;
            }
        }

        String build() {
            return String.valueOf(data);
        }
    }
}
