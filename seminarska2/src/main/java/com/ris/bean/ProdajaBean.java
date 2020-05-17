package com.ris.bean;

import com.ris.database.Database;
import com.ris.database.ProdajaArtikla;
import com.ris.scope.ScopeName;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ScopeName.VIEW)
@NoArgsConstructor
public class ProdajaBean {

    @Autowired
    private Database database;
    @Getter
    @Setter
    private String artikel;
    @Getter
    @Setter
    private String cena;
    @Getter
    @Setter
    private String zaloga;

    public void add() {
        database.getProdajaArtiklaList().add(new ProdajaArtikla(artikel, cena, zaloga));
    }

    public List<ProdajaArtikla> get() {
        return database.getProdajaArtiklaList();
    }
}
