<<<<<<< Updated upstream

// common scripts

(function() {
    "use strict";

   // Sidebar toggle

   jQuery('.menu-list > a').click(function() {
      
      var parent = jQuery(this).parent();
      var sub = parent.find('> ul');
      
      if(!jQuery('body').hasClass('sidebar-collapsed')) {
         if(sub.is(':visible')) {
            sub.slideUp(300, function(){
               parent.removeClass('nav-active');
               jQuery('.body-content').css({height: ''});
               adjustMainContentHeight();
            });
         } else {
            visibleSubMenuClose();
            parent.addClass('nav-active');
            sub.slideDown(300, function(){
                adjustMainContentHeight();
            });
         }
      }
      return false;
   });

   function visibleSubMenuClose() {

      jQuery('.menu-list').each(function() {
         var t = jQuery(this);
         if(t.hasClass('nav-active')) {
            t.find('> ul').slideUp(300, function(){
               t.removeClass('nav-active');
            });
         }
      });
   }

   function adjustMainContentHeight() {

      // Adjust main content height
      var docHeight = jQuery(document).height();
      if(docHeight > jQuery('.body-content').height())
         jQuery('.body-content').height(docHeight);
   }

   // add class mouse hover

   jQuery('.side-navigation > li').hover(function(){
      jQuery(this).addClass('nav-hover');
   }, function(){
      jQuery(this).removeClass('nav-hover');
   });


   // Toggle Menu

   jQuery('.toggle-btn').click(function(){

      var body = jQuery('body');
      var bodyposition = body.css('position');

      if(bodyposition != 'relative') {

         if(!body.hasClass('sidebar-collapsed')) {
            body.addClass('sidebar-collapsed');
            jQuery('.side-navigation ul').attr('style','');

         } else {
            body.removeClass('sidebar-collapsed chat-view');
            jQuery('.side-navigation li.active ul').css({display: 'block'});

         }
      } else {

         if(body.hasClass('sidebar-open'))
            body.removeClass('sidebar-open');
         else
            body.addClass('sidebar-open');

         adjustMainContentHeight();
      }

       var owl = $("#news-feed").data("owlCarousel");
       owl.reinit();

   });
   

   searchform_reposition();

   jQuery(window).resize(function(){

      if(jQuery('body').css('position') == 'relative') {

         jQuery('body').removeClass('sidebar-collapsed');

      } else {

         jQuery('body').css({left: '', marginRight: ''});
      }

      searchform_reposition();

   });

   function searchform_reposition() {
      if(jQuery('.search-content').css('position') == 'relative') {
         jQuery('.search-content').insertBefore('.sidebar-left-info .search-field');
      } else {
         jQuery('.search-content').insertAfter('.right-notification');
      }
   }

    // right slidebar

    $(function(){
        $.slidebars();
    });

    // body scroll

    $("html").niceScroll({
        styler: "fb",
        cursorcolor: "#a979d1",
        cursorwidth: '5',
        cursorborderradius: '15px',
        background: '#404040',
        cursorborder: '',
        zindex: '12000'
    });

    $(".notification-list-scroll").niceScroll({
        styler: "fb",
        cursorcolor: "#DFDFE2",
        cursorwidth: '3',
        cursorborderradius: '15px',
//        background: '#404040',
        cursorborder: '',
        zindex: '12000'
    });



    // collapsible panel
    
    $('.panel .tools .t-collapse').click(function () {
        var el = $(this).parents(".panel").children(".panel-body");
        if ($(this).hasClass("fa-chevron-down")) {
            $(this).removeClass("fa-chevron-down").addClass("fa-chevron-up");
            el.slideUp(200);
        } else {
            $(this).removeClass("fa-chevron-up").addClass("fa-chevron-down");
            el.slideDown(200); }
    });


    // close panel 
    $('.panel .tools .t-close').click(function () {
        $(this).parents(".panel").parent().remove();
    });


    // side widget close

    $('.side-w-close').on('click', function(ev) {
        ev.preventDefault();
        $(this).parents('.aside-widget').slideUp();
    });
    $('.info .add-people').on('click', function(ev) {
        ev.preventDefault();
        $(this).parents('.tab-pane').children('.aside-widget').slideDown();

    });


    // refresh panel

    $('.box-refresh').on('click', function(br) {
        br.preventDefault();
        $("<div class='refresh-block'><span class='refresh-loader'><i class='fa fa-spinner fa-spin'></i></span></div>").appendTo($(this).parents('.tools').parents('.panel-heading').parents('.panel'));

        setTimeout(function() {
            $('.refresh-block').remove();
        }, 1000);

    });

    // tool tips

    $('.tooltips').tooltip();

    // popovers

    $('.popovers').popover();



})(jQuery);
=======
//
// Scripts
//

"use strict";

/* -------------------------------------------------------------------------------------- //

	Options

	Here you can customize the options for your website

// -------------------------------------------------------------------------------------- */

var options = true, // Enable / Disable user settings

scrollToElement = {

	/* -------------------------------------------------------------------------------------- //

		With this duration option you can change the scrolling speed to the item. Duration are
		given in milliseconds. Higher values indicate slower animations, not faster ones.

	// -------------------------------------------------------------------------------------- */

	scrollSpeed : 700  // Milliseconds

},

GoogleMapAPI = {

	/* -------------------------------------------------------------------------------------- //

		To use the Maps JavaScript API, you must register your app project on the Google
		Cloud Platform Console and get a Google API key which you can add to your app.

	// -------------------------------------------------------------------------------------- */

	key : 'AIzaSyBKAtINYLdAjSg-qBuhCndrkN7BBu22dGc', // YOUR_API_KEY

	/* -------------------------------------------------------------------------------------- //

		By default the API will attempt to load the most appropriate language based on the
		users location or browser settings. Some APIs allow you to explicitly set a language
		when you make a request

	// -------------------------------------------------------------------------------------- */

	language : '', // auto by default

	/* -------------------------------------------------------------------------------------- //

		If you set the language of the map, it's important to consider setting the region too.
		This helps ensure that your application complies with local laws.

	// -------------------------------------------------------------------------------------- */

	region : '', // auto by default

	/* -------------------------------------------------------------------------------------- //

		You may wish to turn off the API's default UI settings entirely. To do so, set the
		map's disableDefaultUI property to true. This property disables any automatic UI
		behavior from the Maps JavaScript API.

	// -------------------------------------------------------------------------------------- */

	disableDefaultUI : false,

	/* -------------------------------------------------------------------------------------- //

		The icon can simply indicate an image to use instead of the default Google Maps
		pushpin icon. To specify such an icon, set the marker's icon property to the URL of
		an image. The Maps JavaScript API will size the icon automatically.

	// -------------------------------------------------------------------------------------- */

	markerIcon: '',

	/* -------------------------------------------------------------------------------------- //

		You can use the custom style for the map. Copy and paste your style below.
		To switch, use data-map-style="custom" in your HTML code.

	// -------------------------------------------------------------------------------------- */

	customMapStyle: ''

},

slider = {

	/* -------------------------------------------------------------------------------------- //

		The amount of time to delay between automatically cycling an item. If false,
		carousel will not automatically cycle.

	// -------------------------------------------------------------------------------------- */

	interval : 5000, // Milliseconds

},

scrollbar = {
	zindex: 12
};
>>>>>>> Stashed changes
