package com.onlineShoppingApp.OnlineShopping.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class UserConfigServiceTest {
    /**
     * Method under test: {@link UserConfigService#loadUserByUsername(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadUserByUsername() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException
        //       at com.onlineShoppingApp.OnlineShopping.service.UserConfigService.loadUserByUsername(UserConfigService.java:21)
        //   See https://diff.blue/R013 to resolve this issue.

        (new UserConfigService()).loadUserByUsername("janedoe");
    }
}

