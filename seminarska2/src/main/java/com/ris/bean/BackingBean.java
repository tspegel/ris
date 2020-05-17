package com.ris.bean;

import com.ris.scope.ScopeName;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ScopeName.SESSION)
public class BackingBean {

    List<ShoppingModel> shoppingModelList = new ArrayList<>();
    @Getter
    @Setter
    private String poster;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String cost;

    public void add() {
        shoppingModelList.add(new ShoppingModel(poster,
                                                name,
                                                cost));
    }

    public List<ShoppingModel> getShoppingModelList() {
        return shoppingModelList;
    }
}
