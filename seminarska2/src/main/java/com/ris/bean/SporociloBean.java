package com.ris.bean;

import com.ris.database.Database;
import com.ris.database.Sporocilo;
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
public class SporociloBean {

    @Autowired
    private Database database;
    @Getter
    @Setter
    private String sporocila;
    @Getter
    @Setter
    private String datum;
    @Getter
    @Setter
    private String poslal;
    @Getter
    @Setter
    private String sprejel;

    public void add() {
        datum = "20-10-2020";
        poslal = "Jane Doe";
        sprejel = "Luke Skywalker";
        database.getSporocilo().add(new Sporocilo(sporocila, datum, poslal, sprejel));
    }

    public List<Sporocilo> get() {
        return database.getSporocilo();
    }

}
