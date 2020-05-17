package com.ris.database;

import com.ris.scope.ScopeName;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ScopeName.SESSION)
public class Database {

    @Getter
    @Setter
    private List<ProdajaArtikla> prodajaArtiklaList = new ArrayList<>();
    @Getter
    @Setter
    private List<ProdajaOpreme> prodajaOpremes = new ArrayList<>();
    @Getter
    @Setter
    private List<Prosnja> prosnja = new ArrayList<>();
    @Getter
    @Setter
    private List<Sporocilo> sporocilo = new ArrayList<>();
    @Getter
    @Setter
    private List<SvSpletniNakupi> svSpletniNakupi = new ArrayList<>();
    @Getter
    @Setter
    private List<Uporabnik> uporabnik = new ArrayList<>();
    @Getter
    @Setter
    private List<Vabilo> vabilo = new ArrayList<>();
    @Getter
    @Setter
    private List<ZmBend> zmBend = new ArrayList<>();
    @Getter
    @Setter
    private List<ZmGlasbenik> zmGlasbenik = new ArrayList<>();

}
