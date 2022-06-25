package apps.ebay;

import base.CommonAPI;
import org.testng.annotations.Test;
import pages.ebay.SocialMediaPage;

public class SocialMediaPageTest extends CommonAPI {
    @Test
    public void Facebook(){
        SocialMediaPage book = new SocialMediaPage(getDriver());
        book.setFabook();
       // Assert.assertTrue(getDriver().findElement(By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.rq0escxv.l9j0dhe7.du4w35lb div.rq0escxv.l9j0dhe7.du4w35lb:nth-child(6) div.du4w35lb.l9j0dhe7.cbu4d94t.j83agx80 div.j83agx80.cbu4d94t.l9j0dhe7.jgljxmt5.be9z9djy div.j83agx80.cbu4d94t.d6urw2fd.dp1hu0rb.l9j0dhe7.du4w35lb:nth-child(1) div.l9j0dhe7.dp1hu0rb.cbu4d94t.j83agx80:nth-child(1) div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.taijpn5t.gs1a9yip.owycx6da.btwxx1t3.ihqw7lf3.cddn0xzi:nth-child(2) div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.hpfvmrgz.rj1gh0hx.buofh1pr.g5gj957u.hv4rvrfc.dati1w0a.marjyy4e.vyvkbejw.sneqf9fb div.k4urcfbm div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.i1fnvgqd.aovydwv3.lhclo0ds.btwxx1t3.discj3wi.dlv3wnog.rl04r1d5.enqfppq2.muag1w35 div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.d2edcug0.hpfvmrgz.buofh1pr.g5gj957u.o8rfisnq.ph5uu5jm.b3onmgus.ecm0bbzt.on77hlbc.ihqw7lf3:nth-child(2) div.tr9rh885 div.j83agx80.cbu4d94t.obtkqiv7.sv5sfqaa div.bi6gxh9e.aov4n071:nth-child(1) h2.gmql0nx0.l94mrbxd.p1ri9a11.lzcic4wl.d2edcug0.hpfvmrgz span.d2edcug0.hpfvmrgz.qv66sw1b.c1et5uql.lr9zc1uh.a8c37x1j.fe6kdd0r.mau55g9w.c8b282yb.keod5gw0.nxhoafnm.aigsh9s9.embtmqzv.hrzyx87i.m6dqt4wy.h7mekvxk.hnhda86s.oo9gr5id.hzawbc8m > span:nth-child(1)")).isDisplayed());

    }
    @Test
    public void Twitter(){
        SocialMediaPage twii = new SocialMediaPage(getDriver());
        twii.setTwitter();
        //Assert.assertTrue(getDriver().findElement(By.cssSelector("div.css-1dbjc4n.r-13awgt0.r-12vffkv div.css-1dbjc4n.r-13awgt0.r-12vffkv div.css-1dbjc4n.r-18u37iz.r-13qz1uu.r-417010 main.css-1dbjc4n.r-1habvwh.r-16xksha.r-1wbh5a2:nth-child(4) div.css-1dbjc4n.r-150rngu.r-16y2uox.r-1wbh5a2.r-33ulu8 div.css-1dbjc4n.r-aqfbo4.r-16y2uox div.css-1dbjc4n.r-1oszu61.r-1niwhzg.r-18u37iz.r-16y2uox.r-1wtj0ep.r-2llsf.r-13qz1uu div.css-1dbjc4n.r-kemksi.r-1kqtdi0.r-1ljd8xs.r-13l2t4g.r-1phboty.r-1jgb5lz.r-11wrixw.r-61z16t.r-1ye8kvj.r-13qz1uu.r-184en5c div.css-1dbjc4n div.css-1dbjc4n:nth-child(2) div.css-1dbjc4n.r-16y2uox div.css-1dbjc4n.r-1jgb5lz.r-1ye8kvj.r-13qz1uu div.css-1dbjc4n:nth-child(1) div.css-1dbjc4n.r-1ifxtd0.r-ymttw5.r-ttdzmv div.css-1dbjc4n.r-6gpygo.r-14gqq1x:nth-child(2) div.css-1dbjc4n.r-1wbh5a2.r-dnmrzs.r-1ny4l3l div.css-1dbjc4n.r-1wbh5a2.r-dnmrzs.r-1ny4l3l div.css-1dbjc4n.r-1ny4l3l:nth-child(1) div.css-1dbjc4n.r-1awozwy.r-18u37iz.r-dnmrzs div.css-901oao.r-1awozwy.r-1nao33i.r-6koalj.r-37j5jr.r-adyw6z.r-1vr29t4.r-135wba7.r-bcqeeo.r-1udh08x.r-qvutc0 span.css-901oao.css-16my406.r-poiln3.r-bcqeeo.r-qvutc0:nth-child(1) > span.css-901oao.css-16my406.r-poiln3.r-bcqeeo.r-qvutc0")).isDisplayed());


    }
}
