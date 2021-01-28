USE db8ma8skhzff3w

UPDATE wp_options
SET option_value = 'localhost'  --http://johnm5.sgedu.site
WHERE option_name = 'home';

UPDATE wp_options
SET option_value = 'localhost'  --http://johnm5.sgedu.site
WHERE option_name = 'siteurl';

UPDATE wp_posts
SET post_content = REPLACE(post_content,'http://johnm5.sgedu.site','localhost');

UPDATE wp_posts
SET guid = REPLACE(guid,'http://johnm5.sgedu.site','localhost');
