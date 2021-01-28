<header role="banner">
	<nav class='navbar navbar-default nav-webstrap <?php echo esc_attr(specia_sticky_menu()); ?>' role='navigation'>
		
		<div class="container webstrap-border">

			<!-- Mobile Display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only"><?php _e('Toggle navigation','webstrap');?></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
			</div>
			<!-- /Mobile Display -->

			<!-- Menu Toggle -->
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<div class="container">
					<div class="row">
						<div class="col-md-7 col-xs-12 padding-0">
							<?php
								
								$webstrap_btn_lbl		= get_theme_mod('button_label','Book Now');
								$webstrap_btn_url		= esc_url( get_theme_mod('button_url') );
								$webstrap_btn_target	= get_theme_mod('button_target');
								$webstrap_btn_icon		= get_theme_mod('button_icon','fa-user'); 			
								$webstrap_header_cart	= get_theme_mod('header_cart','on');
								
								$extra_html  = '<ul>';
								
								if($webstrap_header_cart == 'on') {
								$extra_html .= "<li><div class='webstrap-cart'>";
								
								if ( in_array( 'woocommerce/woocommerce.php', apply_filters( 'active_plugins', get_option( 'active_plugins' ) ) ) ) {
									$count = WC()->cart->cart_contents_count;
									$cart_url = wc_get_cart_url();
									
									$extra_html .= "<a href='$cart_url' class='cart-icon'>"."<i class='fa fa-cart-arrow-down'></i>";
									
									if ( $count > 0 ) {
										
										$extra_html .= "<span class='count'>$count</span>";
									
									}
									
									else {
										
										$extra_html .= "<span class='count'>0</span>";
									}
									
									$extra_html .= "</a>";
								}
								
								$extra_html .= "</div></li>";
								
								}
								
								if(($webstrap_btn_target)== 1){ 
									$webstrap_btn_target= "target='_blank'"; 
								}
								
								$extra_html .= "<li><div class='webstrap_button'><a href='$webstrap_btn_url' $webstrap_btn_target class='webstrap-button'>"."<i class='fa $webstrap_btn_icon'></i>"." "."$webstrap_btn_lbl"."</a></div></li>";
								$extra_html .= '</ul>';
									
								wp_nav_menu( 
									array(  
										'theme_location' => 'primary_menu',
										'container'  => '',
										'menu_class' => 'nav navbar-nav',
										'fallback_cb' => 'specia_fallback_page_menu',
										'walker' => new specia_nav_walker()
										 ) 
									);
							?>
						</div>
						
						<div class="col-md-2 col-xs-12 header-top-info-8">
						<!-- Start Social Media Icons -->
						<?php 
							$webstrap_hs_social				= get_theme_mod('hide_show_social','1'); 
							$webstrap_facebook_link			= get_theme_mod('facebook_link',''); 
							$webstrap_linkedin_link			= get_theme_mod('linkedin_link',''); 
							$webstrap_twitter_link			= get_theme_mod('twitter_link',''); 
							$webstrap_googleplus_link		= get_theme_mod('googleplus_link',''); 
							$webstrap_instagram_link		= get_theme_mod('instagram_link',''); 
							$webstrap_dribble_link			= get_theme_mod('dribble_link',''); 
							$webstrap_github_link			= get_theme_mod('github_link',''); 
							$webstrap_bitbucket_link		= get_theme_mod('bitbucket_link',''); 
							$webstrap_email_link			= get_theme_mod('email_link',''); 
							$webstrap_skype_link			= get_theme_mod('skype_link',''); 
							$webstrap_skype_action_link		= get_theme_mod('skype_action_link','');
							$webstrap_vk_link				= get_theme_mod('vk_link','');
							$webstrap_pinterest_link		= get_theme_mod('pinterest_link','');	
							$webstrap_social_target			= get_theme_mod('social_target');
						?>
						
						
						<?php if($webstrap_hs_social == '1') { ?>
							<ul class="social pull-left">
								<?php if($webstrap_facebook_link) { ?> 
									<li><a href="<?php echo esc_url($webstrap_facebook_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-facebook"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_linkedin_link) { ?> 
								<li><a href="<?php echo esc_url($webstrap_linkedin_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-linkedin"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_twitter_link) { ?> 
								<li><a href="<?php echo esc_url($webstrap_twitter_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-twitter"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_googleplus_link) { ?> 
								<li><a href="<?php echo esc_url($webstrap_googleplus_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-google-plus"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_instagram_link) { ?> 
								<li><a href="<?php echo esc_url($webstrap_instagram_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-instagram"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_dribble_link) { ?> 
								<li><a href="<?php echo esc_url($webstrap_dribble_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-dribbble"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_github_link) { ?> 
								<li><a href="<?php echo esc_url($webstrap_github_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-github-alt"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_bitbucket_link) { ?> 
								<li><a href="<?php echo esc_url($webstrap_bitbucket_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-bitbucket"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_email_link) { ?> 
								<li><a href="mailto:<?php echo esc_attr($webstrap_email_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-envelope-o"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_skype_link) { ?> 
								<li><a href="<?php echo esc_attr($webstrap_skype_link); ?>?<?php echo esc_attr($webstrap_skype_action_link); ?>"><i class="fa fa-skype"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_vk_link) { ?> 
									<li><a href="<?php echo esc_url($webstrap_vk_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-vk"></i></a></li>
								<?php } ?>
								
								<?php if($webstrap_pinterest_link) { ?> 
									<li><a href="<?php echo esc_url($webstrap_pinterest_link); ?>" <?php if(($webstrap_social_target)== 1){ echo "target='_blank'"; } ?>><i class="fa fa-pinterest-square"></i></a></li>
								<?php } ?>
							</ul>
						<?php } ?>
						<!-- /End Social Media Icons-->
						</div>
						
						<div class="col-md-3 col-xs-12 webstrap-button-container">
							<?php echo $extra_html; ?>
						</div>
						
					</div>
			</div>
			<!-- Menu Toggle -->	
		</div>
	</nav>
</header>
<div class="clearfix"></div>
<?php 
if ( !is_page_template( 'templates/template-homepage-one.php' )) {
		specia_breadcrumbs_style(); 
	}
?>