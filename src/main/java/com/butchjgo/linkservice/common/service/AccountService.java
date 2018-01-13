package com.butchjgo.linkservice.common.service;

import com.butchjgo.linkservice.common.domain.AccountInfo;
import javassist.NotFoundException;

public interface AccountService {
    AccountInfo getAccount(String requestToken, String server) throws NotFoundException;
}
