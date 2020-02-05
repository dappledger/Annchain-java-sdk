package com.genesis.api.bean.genesis;

import lombok.Data;

@Data
public class ResultQuery {

    private ResultBean result;

    @Data
    public static class ResultBean {

        private int Code;
        private String Data;
        private String Log;
        public boolean isSuccess(){
            return this.Code == 0;
        }
    }
}
