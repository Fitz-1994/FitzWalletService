package org.fitz.wallet.dto;

import org.fitz.wallet.entity.Account;
import org.fitz.wallet.entity.Asset;

import java.util.List;

public class AssetDto {
    private Account account;
    private List<Asset> assets;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }
}
