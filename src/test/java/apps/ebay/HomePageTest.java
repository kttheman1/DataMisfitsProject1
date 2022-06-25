package apps.ebay;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ebay.HomePage;

public class HomePageTest extends CommonAPI {
    @Test
    public void sell(){
        HomePage HMT = new HomePage(getDriver());
        HMT.setSell();
        HMT.setSerf();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }


    @Test
    public void homeTest() {
        HomePage HMT = new HomePage(getDriver());
        HMT.setShopnow();
        // HMT.setSummary();

        // HMT.setSerf();
        //HMT.setShopnow();
        //HMT.setPhotos();

        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());


//    }
//    @Test
//    public void summary(){
//        HomePage HMT = new HomePage(getDriver());
//        HMT.setSummary();
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
//
//
//
//
//    }
        //   @Test
//    public void serf(){
//        HomePage HMT = new HomePage(getDriver());
//        //HMT.setShopnow();
//        HMT.setSerf();
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

//
//    }
//    @Test
//    public void photos(){
//        HomePage HMT = new HomePage(getDriver());
//        HMT.setPhotos();
//
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());
//
//
//
//    }
    //}
//    @Test
//    public void facebook(){
//        HomePage HMT = new HomePage(getDriver());
//       HMT.setFabook();
//        Assert.assertTrue(getDriver().findElement(By.cssSelector("body._6s5d._71pn.system-fonts--body.segoe:nth-child(2) div.rq0escxv.l9j0dhe7.du4w35lb div.rq0escxv.l9j0dhe7.du4w35lb:nth-child(6) div.du4w35lb.l9j0dhe7.cbu4d94t.j83agx80 div.j83agx80.cbu4d94t.l9j0dhe7.jgljxmt5.be9z9djy div.j83agx80.cbu4d94t.d6urw2fd.dp1hu0rb.l9j0dhe7.du4w35lb:nth-child(1) div.l9j0dhe7.dp1hu0rb.cbu4d94t.j83agx80:nth-child(1) div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.taijpn5t.gs1a9yip.owycx6da.btwxx1t3.ihqw7lf3.cddn0xzi:nth-child(2) div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.hpfvmrgz.rj1gh0hx.buofh1pr.g5gj957u.hv4rvrfc.dati1w0a.marjyy4e.vyvkbejw.sneqf9fb div.k4urcfbm div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.pfnyh3mw.i1fnvgqd.aovydwv3.lhclo0ds.btwxx1t3.discj3wi.dlv3wnog.rl04r1d5.enqfppq2.muag1w35 div.rq0escxv.l9j0dhe7.du4w35lb.j83agx80.cbu4d94t.d2edcug0.hpfvmrgz.buofh1pr.g5gj957u.o8rfisnq.ph5uu5jm.b3onmgus.ecm0bbzt.on77hlbc.ihqw7lf3:nth-child(2) div.tr9rh885 div.j83agx80.cbu4d94t.obtkqiv7.sv5sfqaa div.bi6gxh9e.aov4n071:nth-child(2) span.d2edcug0.hpfvmrgz.qv66sw1b.c1et5uql.lr9zc1uh.a8c37x1j.fe6kdd0r.mau55g9w.c8b282yb.keod5gw0.nxhoafnm.aigsh9s9.d3f4x2em.mdeji52x.a5q79mjw.g1cxx5fr.b1v8xokw.m9osqain.hzawbc8m span.d2edcug0.hpfvmrgz.qv66sw1b.c1et5uql.lr9zc1uh.a5q79mjw.g1cxx5fr.b1v8xokw.m9osqain > span.tojvnm2t.a6sixzi8.abs2jz4q.a8s20v7p.t1p8iaqh.k5wvi7nf.q3lfd5jv.pk4s997a.bipmatt0.cebpdrjk.qowsmv63.owwhemhu.dp1hu0rb.dhp61c6y.iyyx5f41:nth-child(1)")).isDisplayed());


    }
    @Test
    public void twitter(){
        HomePage HMT = new HomePage(getDriver());
        HMT.setTwitter();
        Assert.assertTrue(getDriver().findElement(By.cssSelector("#gh-logo")).isDisplayed());

    }
}
