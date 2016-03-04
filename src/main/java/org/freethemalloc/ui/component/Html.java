package org.freethemalloc.ui.component;

import java.util.List;

import javax.swing.text.html.HTML;
import javax.swing.text.html.HTMLDocument;

import com.sun.webkit.dom.HTMLDocumentImpl;

public class Html {
	
	/**
	 * Get html <b>a</b> tag
	 * @param list
	 * @return html <b>a</b> tag
	 */
	public static String getA(List<Attribute> list) {
		String a = "<a ";
		for(Attribute attr : list){
			a += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return a + "/>";
	}
	
	/**
	 * Get html <b>abbr</b> tag
	 * @param list
	 * @param htmlValue
	 * @return html <b>abbr</b> tag
	 */
	public static String getAbbr(List<Attribute> list,String htmlValue) {
		String abbr = "<abbr ";
		for(Attribute attr : list){
			abbr += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return abbr + ">"+htmlValue +"</abbr>";
	}
	
	/**
	 *  Get html <b>address</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue {@link String}
	 * @return html bdo tag {@link String}
	 */
	public static String getAddress(List<Attribute> list, String htmlValue) {
		String address = "<address ";
		for(Attribute attr : list){
			address += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return address+">"+htmlValue+"</address>";
	}

	/**
	 * Get html <b>area</> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @return area html area tag
	 */
	public static String getArea(List<Attribute> list) {
		String area = "<area ";
		for(Attribute attr : list){
			area += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return area+">";
	}
	
	/**
	 * Get html article tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return article html article tag
	 */
	public static String getArticle(List<Attribute> list,String htmlValue) {
		String article = "<article ";
		for(Attribute attr : list){
			article += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return article+">"+htmlValue+"</article>";
	}
	
	/**
	 * Get html aside tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue tag value
	 * @return aside html aside tag
	 */
	public static String getAside(List<Attribute> list,String htmlValue) {
		String aside = "<aside ";
		Integer a =0;
		for(Attribute attr : list){
			aside += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return aside +">"+htmlValue+"</aside>";
	}
	
	/**
	 * Get html audio tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue tag value
	 * @return <b>audio</b> html audio tag
	 */
	public static String getAudio(List<Attribute> list,String htmlValue) {
		String audio = "<audio ";
		for(Attribute attr : list){
			audio += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return audio+">"+htmlValue+"</audio>";
	}
	
	/**
	 * Get html b tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return html <b>b</b> tag
	 */
	public static String getB(List<Attribute> list,String htmlValue) {
		String b = "<b ";
		for(Attribute attr : list){
			b += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return b+">"+htmlValue+"</b>";
	}
	
	/**
	 * Get html base tag
	 * @param list {@link List}<{@link Attribute}>
	 * @return html <b>base</b> tag
	 */
	public static String getBase(List<Attribute> list) {
		String base = "<base ";
		for(Attribute attr : list){
			base += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return base+">";
	}
	
	/**
	 * Get html dbi tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return html bdi tag
	 */
	public static String getBdi(List<Attribute> list,String htmlValue) {
		String bdi = "<bdi ";
		for(Attribute attr : list){
			bdi += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return bdi+">"+htmlValue+"</dbi>";
	}
	
	/**
	 * Get html <b>dbo</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param dir {@link String} text direction
	 * @param htmlValue {@link String}
	 * @return html bdo tag {@link String}
	 */
	public static String getBdo(List<Attribute> list,String dir,String htmlValue) {
		String bdo = "<bdo dir=\""+dir+"\" ";
		for(Attribute attr : list){
			bdo += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return bdo+">"+htmlValue+"</bdo>";
	}
	
	/**
	 * Get html <b>blockquote</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param cite {@link String} Specifies the source of the quotation
	 * @param htmlValue {@link String}
	 * @return html blockquote tag
	 */
	public static String getBlockquote(List<Attribute> list,String cite,String htmlValue) {
		String blockquote = "<blockquote cite=\""+cite+"\" ";
		for(Attribute attr : list){
			blockquote += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return blockquote+">"+htmlValue+"</blockquote>";
	}
	
	/**
	 * Get Html <b>body</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue {@link String}
	 * @return html body tag
	 */
	public static String getBody(List<Attribute> list,String htmlValue) {
		String body = "<body ";
		for(Attribute attr : list){
			body += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return body+">"+htmlValue+"</body>";
	}
	
	/**
	 * Get html <b>br</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @return html br tag
	 */
	public static String getBr(List<Attribute> list) {
		String br = "<br ";
		for(Attribute attr : list){
			br += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return br+"/>";
	}
	
	/**
	 * Get html <b>button</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue {@link String}
	 * @return html button tag 
	 */
	public static String getButton(List<Attribute> list,String htmlValue) {
		String button = "<button ";
		for(Attribute attr : list){
			button += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return button+">"+htmlValue+"</button>";
	}
	
	/**
	 * Get html <b>canvas</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @return html canvas tag
	 */
	public static String getCanvas(List<Attribute> list) {
		String canvas = "<canvas ";
		for(Attribute attr : list){
			canvas += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return canvas+"></convas>";
	}
	
	/**
	 * Get html <b>caption</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue {@link String}
	 * @return html caption tag 
	 */
	public static String getCaption(List<Attribute> list,String htmlValue) {
		String caption = "<caption ";
		for(Attribute attr : list){
			caption += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return caption+">"+htmlValue+"</caption>";
	}
	
	/**
	 * Get html <b>cite</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue {@link String}
	 * @return html cite tag
	 */
	public static String getCite(List<Attribute> list,String htmlValue) {
		String cite = "<cite ";
		for(Attribute attr : list){
			cite += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return cite+">"+htmlValue+"</cite>";
	}
	
	/**
	 * Get html <b>code</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue {@link String}
	 * @return html code tag
	 */
	public static String getCode(List<Attribute> list,String htmlValue) {
		String code = "<code ";
		for(Attribute attr : list){
			code += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return code+">"+htmlValue+"</code>";
	}
	
	/**
	 * Get html <b>col</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @return html col tag
	 */
	public static String getCol(List<Attribute> list) {
		String col = "<col ";
		for(Attribute attr : list){
			col += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return col+">";
	}
	
	/**
	 * Get html <b>colgroup</b>tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param cols col tags
	 * @return html colgroup tag
	 */
	public static String getColgroup(List<Attribute> list,String cols) {
		String colgroup = "<colgroup ";
		for(Attribute attr : list){
			colgroup += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return colgroup+">"+cols+"</colgroup>";
	}
	
	/**
	 * Get html <b>datalist</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param options option Tags
	 * @return html datalist tag
	 */
	public static String getDatalist(List<Attribute> list,String options) {
		String datalist = "<datalist ";
		for(Attribute attr : list){
			datalist += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return datalist+">"+options+"</datalist>";
	}
	
	/**
	 * Get html <b>dd</b> tag<br />
	 * dd : A description list, with terms and descriptions
	 * @param list {@link List}<{@link Attribute}>
	 * @param dt terms
	 * @return html dd tag
	 */
	public static String getDd(List<Attribute> list,String dt) {
		String dd = "<dd ";
		for(Attribute attr : list){
			dd += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return dd+">"+dt+"</dd>";
	}
	
	/**
	 * Get html <b>del</b> tag <br />
	 * del : A text with a deleted part
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue text
	 * @return html del tag
	 */
	public static String getDel(List<Attribute> list,String htmlValue) {
		String del = "<del ";
		for(Attribute attr : list){
			del += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return del+">"+htmlValue+"</del>";
	}
	
	/**
	 * Get html <b>details</b> tag <br />
	 * details : specifies additional details that the user can view or hide on demand.
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return details tag
	 */
	public static String getDetails(List<Attribute> list,String htmlValue) {
		String details = "<details ";
		for(Attribute attr : list){
			details += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return details+">"+htmlValue+"</details>";
	}
	
	/**
	 * Get html <b>dfn</b> tag
	 * dfn : Mark up the defining instance of a term
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return html dfn tag
	 */
	public static String getDfn(List<Attribute> list,String htmlValue) {
		String dfn = "<dfn ";
		for(Attribute attr : list){
			dfn += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return dfn+">"+htmlValue+"</dfn>";
	}
	
	/**
	 * Get html <b>dialog</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return html dialog tag
	 */
	public static String getDialog(List<Attribute> list,String htmlValue) {
		String dialog = "<dialog ";
		for(Attribute attr : list){
			dialog += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return dialog+">"+htmlValue+"</dialog>";
	}
	
	/**
	 * Get html <b>div</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return div tag
	 */
	public static String getDiv(List<Attribute> list,String htmlValue) {
		String div = "<div ";
		for(Attribute attr : list){
			div += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return div+">"+htmlValue+"</div>";
	}
	
	/**
	 * Get html <b>dl</b> tag
	 * @param list {@link List}<{@link Attribute}>
	 * @param htmlValue
	 * @return
	 */
	public static String getDl(List<Attribute> list,String htmlValue) {
		String dl = "<dl ";
		for(Attribute attr : list){
			dl += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return dl+">"+htmlValue+"</dl>";
	}
	public static String getDt(List<Attribute> list,String htmlValue) {
		String dt = "<dt ";
		for(Attribute attr : list){
			dt += attr.getAttribute()+"= \""+attr.getValue()+"\" ";
		}
		return dt;
	}
	/*public static String getEm(List<Attribute> list) {
		return em;
	}
	public static String getEmbed(List<Attribute> list) {
		return embed;
	}
	public static String getFieldset(List<Attribute> list) {
		return fieldset;
	}
	public static String getFigcaption(List<Attribute> list) {
		return figcaption;
	}
	public static String getFigure(List<Attribute> list) {
		return figure;
	}
	public static String getFooter(List<Attribute> list) {
		return footer;
	}
	public static String getForm(List<Attribute> list) {
		return form;
	}
	public static String getH1(List<Attribute> list) {
		return h1;
	}
	public static String getH2(List<Attribute> list) {
		return h2;
	}
	public static String getH3(List<Attribute> list) {
		return h3;
	}
	public static String getH4(List<Attribute> list) {
		return h4;
	}
	public static String getH5(List<Attribute> list) {
		return h5;
	}
	public static String getH6(List<Attribute> list) {
		return h6;
	}
	public static String getHead(List<Attribute> list) {
		return head;
	}
	public static String getHeader(List<Attribute> list) {
		return header;
	}
	public static String getHr(List<Attribute> list) {
		return hr;
	}
	public static String getHtml(List<Attribute> list) {
		return html;
	}
	public static String getI(List<Attribute> list) {
		return i;
	}
	public static String getIframe(List<Attribute> list) {
		return iframe;
	}
	public static String getImg(List<Attribute> list) {
		return img;
	}
	public static String getInput(List<Attribute> list) {
		return input;
	}
	public static String getIns(List<Attribute> list) {
		return ins;
	}
	public static String getKbd(List<Attribute> list) {
		return kbd;
	}
	public static String getLabel(List<Attribute> list) {
		return label;
	}
	public static String getLedgend(List<Attribute> list) {
		return ledgend;
	}
	public static String getLi(List<Attribute> list) {
		return li;
	}
	public static String getLink(List<Attribute> list) {
		return link;
	}
	public static String getMain(List<Attribute> list) {
		return main;
	}
	public static String getMap(List<Attribute> list) {
		return map;
	}
	public static String getMark(List<Attribute> list) {
		return mark;
	}
	public static String getMenu(List<Attribute> list) {
		return menu;
	}
	public static String getMenuitem(List<Attribute> list) {
		return menuitem;
	}
	public static String getMeta(List<Attribute> list) {
		return meta;
	}
	public static String getMeter(List<Attribute> list) {
		return meter;
	}
	public static String getNav(List<Attribute> list) {
		return nav;
	}
	public static String getObject(List<Attribute> list) {
		return object;
	}
	public static String getOl(List<Attribute> list) {
		return ol;
	}
	public static String getOptgroup(List<Attribute> list) {
		return optgroup;
	}
	public static String getOption(List<Attribute> list) {
		return option;
	}
	public static String getOutput(List<Attribute> list) {
		return output;
	}
	public static String getP(List<Attribute> list) {
		return p;
	}
	public static String getParam(List<Attribute> list) {
		return param;
	}
	public static String getPre(List<Attribute> list) {
		return pre;
	}
	public static String getProgress(List<Attribute> list) {
		return progress;
	}
	public static String getQ(List<Attribute> list) {
		return q;
	}
	public static String getRp(List<Attribute> list) {
		return rp;
	}
	public static String getRt(List<Attribute> list) {
		return rt;
	}
	public static String getRuby(List<Attribute> list) {
		return ruby;
	}
	public static String getS(List<Attribute> list) {
		return s;
	}
	public static String getScript(List<Attribute> list) {
		return script;
	}
	public static String getSection(List<Attribute> list) {
		return section;
	}
	public static String getSelect(List<Attribute> list) {
		return select;
	}
	public static String getSmall(List<Attribute> list) {
		return small;
	}
	public static String getSource(List<Attribute> list) {
		return source;
	}
	public static String getSpan(List<Attribute> list) {
		return span;
	}
	public static String getStrong(List<Attribute> list) {
		return strong;
	}
	public static String getStyle(List<Attribute> list) {
		return style;
	}
	public static String getSub(List<Attribute> list) {
		return sub;
	}
	public static String getSummary(List<Attribute> list) {
		return summary;
	}
	public static String getSup(List<Attribute> list) {
		return sup;
	}
	public static String getTable(List<Attribute> list) {
		return table;
	}
	public static String getTbody(List<Attribute> list) {
		return tbody;
	}
	public static String getTd(List<Attribute> list) {
		return td;
	}
	public static String getTextarea(List<Attribute> list) {
		return textarea;
	}
	public static String getTfoot(List<Attribute> list) {
		return tfoot;
	}
	public static String getTh(List<Attribute> list) {
		return th;
	}
	public static String getThead(List<Attribute> list) {
		return thead;
	}
	public static String getTime(List<Attribute> list) {
		return time;
	}
	public static String getTitle(List<Attribute> list) {
		return title;
	}
	public static String getTr(List<Attribute> list) {
		return tr;
	}
	public static String getTrack(List<Attribute> list) {
		return track;
	}
	public static String getU(List<Attribute> list) {
		return u;
	}
	public static String getUl(List<Attribute> list) {
		return ul;
	}
	public static String getVar(List<Attribute> list) {
		return var;
	}
	public static String getVideo(List<Attribute> list) {
		return video;
	}
	public static String getWbr(List<Attribute> list) {
		return wbr;
	}*/
}
