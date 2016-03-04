package org.freethemalloc.ui.generator;

@SuppressWarnings("unused")
/**
 * Bootstrap framework
 * 
 * @author Harshana Samaranayake
 *
 */
public class Bootstrap {

	private String bootstrapHeader;
	/**
	 * 
	 * @param bootstrapCss
	 * @param bootstrapJs
	 * @param jquery
	 */
	public Bootstrap(String bootstrapCss, String bootstrapJs, String jquery) {
		this.bootstrapHeader = bootstrapHeader(bootstrapCss,bootstrapJs,jquery);
	}

	private String bootstrapHeader(String bsCssMin,String bsJsMin,String jqMin) {
		return "<link rel=\"stylesheet\" href=\"" + bsCssMin + "\">" + "<script src=\"" + bsJsMin
				+ "\"></script>" + "<script src=\"" + jqMin + "\"></script>";
	}

	public class BootstrapGrid {

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	}

	public class BootstrapTypography {
	}

	public class BootstrapTable {
	}

	public class BootstrapImages {
	}

	public class BootstrapJumbotron {
	}

	public class BootstrapWells {
	}

	public class BootstrapAlerts {
	}

	public class BootstrapButtons {
	}

	public class BootstrapButtonGroups {
	}

	public class BootstrapGlyphicons {
	}

	public class BootstrapBadgesAndLabels {
	}

	public class BootstrapProgressBar {
	}

	public class BootstrapPagination {
	}

	public class BootstrapPager {
	}

	public class BootstrapListGroup {
	}

	public class BootstrapPanel {
	}

	public class BootstrapDropdown {
	}

	public class BootstrapCollapse {
	}

	public class BootstrapTabsAndPills {
	}

	public class BootstrapNavigationBar {
	}

	public class BootstrapForm {
	}

	public class BootstrapFormInputs {
	}

	public class BootstrapCarousel {
	}

	public class BootstrapModal {
	}

	public class BootstrapTooltip {
	}

	public class BootstrapPopover {
	}

	public class BootstrapScrollspy {
	}

	public class BootstrapAffix {
	}

}
