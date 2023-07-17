package com.mustafafindik.designpatterns.behavioral.memento;

public class BankAccountManager {
    private Memento memento;

    public void saveState(BankAccount account){
        memento = account.save();
        System.out.println("Durum kaydedildi. " + account);
    }

    public void restoreState(BankAccount account){
        if (memento!= null){
            account.restore(memento);
        }else {
            System.out.println("Kayıtlı bir durum bulunamadı.");
        }
    }
}
