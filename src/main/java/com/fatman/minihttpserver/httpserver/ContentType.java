package com.fatman.minihttpserver.httpserver;

import java.util.HashMap;

/**
 * 保存和查询http中的context-type的类
 * @author 肥宅快乐码
 * @date 2020/3/22 - 16:19
 */
public class ContentType {
    private static HashMap<String, String> contentType = new HashMap<>();

    static {
        contentType.put(".*","application/octet-stream");
        contentType.put(".001","application/x-001");
        contentType.put(".323","text/h323");
        contentType.put(".907","drawing/907");
        contentType.put(".acp","audio/x-mei-aac");
        contentType.put(".aif","audio/aiff");
        contentType.put(".aiff","audio/aiff");
        contentType.put(".asa","text/asa");
        contentType.put(".asp","text/asp");
        contentType.put(".au","audio/basic");
        contentType.put(".awf","application/vnd.adobe.workflow");
        contentType.put(".bmp","application/x-bmp");
        contentType.put(".c4t","application/x-c4t");
        contentType.put(".cal","application/x-cals");
        contentType.put(".cdf","application/x-netcdf");
        contentType.put(".cel","application/x-cel");
        contentType.put(".cg4","application/x-g4");
        contentType.put(".cit","application/x-cit");
        contentType.put(".cml","text/xml");
        contentType.put(".cmx","application/x-cmx");
        contentType.put(".crl","application/pkix-crl");
        contentType.put(".csi","application/x-csi");
        contentType.put(".cut","application/x-cut");
        contentType.put(".dbm","application/x-dbm");
        contentType.put(".dcd","text/xml");
        contentType.put(".der","application/x-x509-ca-cert");
        contentType.put(".dib","application/x-dib");
        contentType.put(".doc","application/msword");
        contentType.put(".drw","application/x-drw");
        contentType.put(".dwf","Model/vnd.dwf");
        contentType.put(".dwg","application/x-dwg");
        contentType.put(".dxf","application/x-dxf");
        contentType.put(".emf","application/x-emf");
        contentType.put(".ent","text/xml");
        contentType.put(".eps","application/x-ps");
        contentType.put(".etd","application/x-ebx");
        contentType.put(".fax","image/fax");
        contentType.put(".fif","application/fractals");
        contentType.put(".frm","application/x-frm");
        contentType.put(".gbr","application/x-gbr");
        contentType.put(".gif","image/gif");
        contentType.put(".gp4","application/x-gp4");
        contentType.put(".hmr","application/x-hmr");
        contentType.put(".hpl","application/x-hpl");
        contentType.put(".hrf","application/x-hrf");
        contentType.put(".htc","text/x-component");
        contentType.put(".html","text/html");
        contentType.put(".htx","text/html");
        contentType.put(".ico","image/x-icon");
        contentType.put(".iff","application/x-iff");
        contentType.put(".igs","application/x-igs");
        contentType.put(".img","application/x-img");
        contentType.put(".isp","application/x-internet-signup");
        contentType.put(".java","java/*");
        contentType.put(".jpe","image/jpeg");
        contentType.put(".jpeg","image/jpeg");
        contentType.put(".jpg","application/x-jpg");
        contentType.put(".jsp","text/html");
        contentType.put(".lar","application/x-laplayer-reg");
        contentType.put(".lavs","audio/x-liquid-secure");
        contentType.put(".lmsff","audio/x-la-lms");
        contentType.put(".ltr","application/x-ltr");
        contentType.put(".m2v","video/x-mpeg");
        contentType.put(".m4e","video/mpeg4");
        contentType.put(".man","application/x-troff-man");
        contentType.put(".mdb","application/msaccess");
        contentType.put(".mfp","application/x-shockwave-flash");
        contentType.put(".mhtml","message/rfc822");
        contentType.put(".mid","audio/mid");
        contentType.put(".mil","application/x-mil");
        contentType.put(".mnd","audio/x-musicnet-download");
        contentType.put(".mocha","application/x-javascript");
        contentType.put(".mp1","audio/mp1");
        contentType.put(".mp2v","video/mpeg");
        contentType.put(".mp4","video/mpeg4");
        contentType.put(".mpd","application/vnd.ms-project");
        contentType.put(".mpeg","video/mpg");
        contentType.put(".mpga","audio/rn-mpeg");
        contentType.put(".mps","video/x-mpeg");
        contentType.put(".mpv","video/mpg");
        contentType.put(".mpw","application/vnd.ms-project");
        contentType.put(".mtx","text/xml");
        contentType.put(".net","image/pnetvue");
        contentType.put(".nws","message/rfc822");
        contentType.put(".out","application/x-out");
        contentType.put(".p12","application/x-pkcs12");
        contentType.put(".p7c","application/pkcs7-mime");
        contentType.put(".p7r","application/x-pkcs7-certreqresp");
        contentType.put(".pc5","application/x-pc5");
        contentType.put(".pcl","application/x-pcl");
        contentType.put(".pdf","application/pdf");
        contentType.put(".pdx","application/vnd.adobe.pdx");
        contentType.put(".pgl","application/x-pgl");
        contentType.put(".pko","application/vnd.ms-pki.pko");
        contentType.put(".plg","text/html");
        contentType.put(".plt","application/x-plt");
        contentType.put(".png","application/x-png");
        contentType.put(".ppa","application/vnd.ms-powerpoint");
        contentType.put(".pps","application/vnd.ms-powerpoint");
        contentType.put(".ppt","application/x-ppt");
        contentType.put(".prf","application/pics-rules");
        contentType.put(".prt","application/x-prt");
        contentType.put(".ps","application/postscript");
        contentType.put(".pwz","application/vnd.ms-powerpoint");
        contentType.put(".ra","audio/vnd.rn-realaudio");
        contentType.put(".ras","application/x-ras");
        contentType.put(".rdf","text/xml");
        contentType.put(".red","application/x-red");
        contentType.put(".rjs","application/vnd.rn-realsystem-rjs");
        contentType.put(".rlc","application/x-rlc");
        contentType.put(".rm","application/vnd.rn-realmedia");
        contentType.put(".rmi","audio/mid");
        contentType.put(".rmm","audio/x-pn-realaudio");
        contentType.put(".rms","application/vnd.rn-realmedia-secure");
        contentType.put(".rmx","application/vnd.rn-realsystem-rmx");
        contentType.put(".rp","image/vnd.rn-realpix");
        contentType.put(".rsml","application/vnd.rn-rsml");
        contentType.put(".rtf","application/msword");
        contentType.put(".rv","video/vnd.rn-realvideo");
        contentType.put(".sat","application/x-sat");
        contentType.put(".sdw","application/x-sdw");
        contentType.put(".slb","application/x-slb");
        contentType.put(".slk","drawing/x-slk");
        contentType.put(".smil","application/smil");
        contentType.put(".snd","audio/basic");
        contentType.put(".sor","text/plain");
        contentType.put(".spl","application/futuresplash");
        contentType.put(".ssm","application/streamingmedia");
        contentType.put(".stl","application/vnd.ms-pki.stl");
        contentType.put(".sty","application/x-sty");
        contentType.put(".swf","application/x-shockwave-flash");
        contentType.put(".tg4","application/x-tg4");
        contentType.put(".tif","image/tiff");
        contentType.put(".tiff","image/tiff");
        contentType.put(".top","drawing/x-top");
        contentType.put(".tsd","text/xml");
        contentType.put(".uin","application/x-icq");
        contentType.put(".vcf","text/x-vcard");
        contentType.put(".vdx","application/vnd.visio");
        contentType.put(".vpg","application/x-vpeg005");
        contentType.put(".vsd","application/x-vsd");
        contentType.put(".vst","application/vnd.visio");
        contentType.put(".vsw","application/vnd.visio");
        contentType.put(".vtx","application/vnd.visio");
        contentType.put(".wav","audio/wav");
        contentType.put(".wb1","application/x-wb1");
        contentType.put(".wb3","application/x-wb3");
        contentType.put(".wiz","application/msword");
        contentType.put(".wk4","application/x-wk4");
        contentType.put(".wks","application/x-wks");
        contentType.put(".wma","audio/x-ms-wma");
        contentType.put(".wmf","application/x-wmf");
        contentType.put(".wmv","video/x-ms-wmv");
        contentType.put(".wmz","application/x-ms-wmz");
        contentType.put(".wpd","application/x-wpd");
        contentType.put(".wpl","application/vnd.ms-wpl");
        contentType.put(".wr1","application/x-wr1");
        contentType.put(".wrk","application/x-wrk");
        contentType.put(".ws2","application/x-ws");
        contentType.put(".wsdl","text/xml");
        contentType.put(".xdp","application/vnd.adobe.xdp");
        contentType.put(".xfd","application/vnd.adobe.xfd");
        contentType.put(".xhtml","text/html");
        contentType.put(".xls","application/x-xls");
        contentType.put(".xml","text/xml");
        contentType.put(".xq","text/xml");
        contentType.put(".xquery","text/xml");
        contentType.put(".xsl","text/xml");
        contentType.put(".xwd","application/x-xwd");
        contentType.put(".sis","application/vnd.symbian.install");
        contentType.put(".x_t","application/x-x_t");
        contentType.put(".apk","application/vnd.android.package-archive");
        contentType.put(".tif","image/tiff");
        contentType.put(".301","application/x-301");
        contentType.put(".906","application/x-906");
        contentType.put(".a11","application/x-a11");
        contentType.put(".ai","application/postscript");
        contentType.put(".aifc","audio/aiff");
        contentType.put(".anv","application/x-anv");
        contentType.put(".asf","video/x-ms-asf");
        contentType.put(".asx","video/x-ms-asf");
        contentType.put(".avi","video/avi");
        contentType.put(".biz","text/xml");
        contentType.put(".bot","application/x-bot");
        contentType.put(".c90","application/x-c90");
        contentType.put(".cat","application/vnd.ms-pki.seccat");
        contentType.put(".cdr","application/x-cdr");
        contentType.put(".cer","application/x-x509-ca-cert");
        contentType.put(".cgm","application/x-cgm");
        contentType.put(".class","java/*");
        contentType.put(".cmp","application/x-cmp");
        contentType.put(".cot","application/x-cot");
        contentType.put(".crt","application/x-x509-ca-cert");
        contentType.put(".css","text/css");
        contentType.put(".dbf","application/x-dbf");
        contentType.put(".dbx","application/x-dbx");
        contentType.put(".dcx","application/x-dcx");
        contentType.put(".dgn","application/x-dgn");
        contentType.put(".dll","application/x-msdownload");
        contentType.put(".dot","application/msword");
        contentType.put(".dtd","text/xml");
        contentType.put(".dwf","application/x-dwf");
        contentType.put(".dxb","application/x-dxb");
        contentType.put(".edn","application/vnd.adobe.edn");
        contentType.put(".eml","message/rfc822");
        contentType.put(".epi","application/x-epi");
        contentType.put(".eps","application/postscript");
        contentType.put(".exe","application/x-msdownload");
        contentType.put(".fdf","application/vnd.fdf");
        contentType.put(".fo","text/xml");
        contentType.put(".g4","application/x-g4");
        contentType.put(".","application/x-");
        contentType.put(".gl2","application/x-gl2");
        contentType.put(".hgl","application/x-hgl");
        contentType.put(".hpg","application/x-hpgl");
        contentType.put(".hqx","application/mac-binhex40");
        contentType.put(".hta","application/hta");
        contentType.put(".htm","text/html");
        contentType.put(".htt","text/webviewhtml");
        contentType.put(".icb","application/x-icb");
        contentType.put(".ico","application/x-ico");
        contentType.put(".ig4","application/x-g4");
        contentType.put(".iii","application/x-iphone");
        contentType.put(".ins","application/x-internet-signup");
        contentType.put(".IVF","video/x-ivf");
        contentType.put(".jfif","image/jpeg");
        contentType.put(".jpe","application/x-jpe");
        contentType.put(".jpg","image/jpeg");
        contentType.put(".js","application/x-javascript");
        contentType.put(".la1","audio/x-liquid-file");
        contentType.put(".latex","application/x-latex");
        contentType.put(".lbm","application/x-lbm");
        contentType.put(".ls","application/x-javascript");
        contentType.put(".m1v","video/x-mpeg");
        contentType.put(".m3u","audio/mpegurl");
        contentType.put(".mac","application/x-mac");
        contentType.put(".math","text/xml");
        contentType.put(".mdb","application/x-mdb");
        contentType.put(".mht","message/rfc822");
        contentType.put(".mi","application/x-mi");
        contentType.put(".midi","audio/mid");
        contentType.put(".mml","text/xml");
        contentType.put(".mns","audio/x-musicnet-stream");
        contentType.put(".movie","video/x-sgi-movie");
        contentType.put(".mp2","audio/mp2");
        contentType.put(".mp3","audio/mp3");
        contentType.put(".mpa","video/x-mpg");
        contentType.put(".mpe","video/x-mpeg");
        contentType.put(".mpg","video/mpg");
        contentType.put(".mpp","application/vnd.ms-project");
        contentType.put(".mpt","application/vnd.ms-project");
        contentType.put(".mpv2","video/mpeg");
        contentType.put(".mpx","application/vnd.ms-project");
        contentType.put(".mxp","application/x-mmxp");
        contentType.put(".nrf","application/x-nrf");
        contentType.put(".odc","text/x-ms-odc");
        contentType.put(".p10","application/pkcs10");
        contentType.put(".p7b","application/x-pkcs7-certificates");
        contentType.put(".p7m","application/pkcs7-mime");
        contentType.put(".p7s","application/pkcs7-signature");
        contentType.put(".pci","application/x-pci");
        contentType.put(".pcx","application/x-pcx");
        contentType.put(".pdf","application/pdf");
        contentType.put(".pfx","application/x-pkcs12");
        contentType.put(".pic","application/x-pic");
        contentType.put(".pl","application/x-perl");
        contentType.put(".pls","audio/scpls");
        contentType.put(".png","image/png");
        contentType.put(".pot","application/vnd.ms-powerpoint");
        contentType.put(".ppm","application/x-ppm");
        contentType.put(".ppt","application/vnd.ms-powerpoint");
        contentType.put(".pr","application/x-pr");
        contentType.put(".prn","application/x-prn");
        contentType.put(".ps","application/x-ps");
        contentType.put(".ptn","application/x-ptn");
        contentType.put(".r3t","text/vnd.rn-realtext3d");
        contentType.put(".ram","audio/x-pn-realaudio");
        contentType.put(".rat","application/rat-file");
        contentType.put(".rec","application/vnd.rn-recording");
        contentType.put(".rgb","application/x-rgb");
        contentType.put(".rjt","application/vnd.rn-realsystem-rjt");
        contentType.put(".rle","application/x-rle");
        contentType.put(".rmf","application/vnd.adobe.rmf");
        contentType.put(".rmj","application/vnd.rn-realsystem-rmj");
        contentType.put(".rmp","application/vnd.rn-rn_music_package");
        contentType.put(".rmvb","application/vnd.rn-realmedia-vbr");
        contentType.put(".rnx","application/vnd.rn-realplayer");
        contentType.put(".rpm","audio/x-pn-realaudio-plugin");
        contentType.put(".rt","text/vnd.rn-realtext");
        contentType.put(".rtf","application/x-rtf");
        contentType.put(".sam","application/x-sam");
        contentType.put(".sdp","application/sdp");
        contentType.put(".sit","application/x-stuffit");
        contentType.put(".sld","application/x-sld");
        contentType.put(".smi","application/smil");
        contentType.put(".smk","application/x-smk");
        contentType.put(".sol","text/plain");
        contentType.put(".spc","application/x-pkcs7-certificates");
        contentType.put(".spp","text/xml");
        contentType.put(".sst","application/vnd.ms-pki.certstore");
        contentType.put(".stm","text/html");
        contentType.put(".svg","text/xml");
        contentType.put(".tdf","application/x-tdf");
        contentType.put(".tga","application/x-tga");
        contentType.put(".tif","application/x-tif");
        contentType.put(".tld","text/xml");
        contentType.put(".torrent","application/x-bittorrent");
        contentType.put(".txt","text/plain");
        contentType.put(".uls","text/iuls");
        contentType.put(".vda","application/x-vda");
        contentType.put(".vml","text/xml");
        contentType.put(".vsd","application/vnd.visio");
        contentType.put(".vss","application/vnd.visio");
        contentType.put(".vst","application/x-vst");
        contentType.put(".vsx","application/vnd.visio");
        contentType.put(".vxml","text/xml");
        contentType.put(".wax","audio/x-ms-wax");
        contentType.put(".wb2","application/x-wb2");
        contentType.put(".wbmp","image/vnd.wap.wbmp");
        contentType.put(".wk3","application/x-wk3");
        contentType.put(".wkq","application/x-wkq");
        contentType.put(".wm","video/x-ms-wm");
        contentType.put(".wmd","application/x-ms-wmd");
        contentType.put(".wml","text/vnd.wap.wml");
        contentType.put(".wmx","video/x-ms-wmx");
        contentType.put(".wp6","application/x-wp6");
        contentType.put(".wpg","application/x-wpg");
        contentType.put(".wq1","application/x-wq1");
        contentType.put(".wri","application/x-wri");
        contentType.put(".ws","application/x-ws");
        contentType.put(".wsc","text/scriptlet");
        contentType.put(".wvx","video/x-ms-wvx");
        contentType.put(".xdr","text/xml");
        contentType.put(".xfdf","application/vnd.adobe.xfdf");
        contentType.put(".xls","application/vnd.ms-excel");
        contentType.put(".xlw","application/x-xlw");
        contentType.put(".xpl","audio/scpls");
        contentType.put(".xql","text/xml");
        contentType.put(".xsd","text/xml");
        contentType.put(".xslt","text/xml");
        contentType.put(".x_b","application/x-x_b");
        contentType.put(".sisx","application/vnd.symbian.install");
        contentType.put(".ipa","application/vnd.iphone");
        contentType.put(".xap","application/x-silverlight-app");
    }

    /**
     * 通过文件后缀名返回相应的contextType
     * @param suffix 文件后缀名
     * @return String
     */
    public static String findContextType(String suffix) {
        String result = contentType.get(suffix);
        // 不知道类型，那就用二进制流直接传出去
        if (result == null) {
            return contentType.get(".*");
        }
        return result;
    }
}
