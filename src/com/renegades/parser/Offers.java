package com.renegades.parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Виталик on 04.03.2017.
 */

@XmlRootElement
public class Offers {
    @XmlElement(name = "offer")
    private List<Offer> offerList;

    public void setOfferList(List<Offer> offerList) {
        this.offerList = offerList;
    }
}
