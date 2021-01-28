<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/support/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'db8ma8skhzff3w' );

/** MySQL database username */
define( 'DB_USER', 'u57vk9kgn7kwd' );

/** MySQL database password */
define( 'DB_PASSWORD', 'ngm5nhfbtyza' );

/** MySQL hostname */
define( 'DB_HOST', '' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         '+C&IPPtNWnwx=D,j=bPAs25)2b]0u[.z/ow5 SonD!$mo{1bU8fAN//u<g3`JGbs' );
define( 'SECURE_AUTH_KEY',  'oQ7R);[x`pK-kT+bc*~ohz49&iCAfQZfi.t`(w +yZ|Ly_.n3D;A,|.ob%--J8)f' );
define( 'LOGGED_IN_KEY',    '&Sc]Y]A N$<1UGRzZw`5[O+)G(R7&DJhMI!:) =E-L5]739bXJ)_+mNYwfUM3bs@' );
define( 'NONCE_KEY',        'T!~)md8.UXq_k$K*]_h]>10XI<BFzd,`wV|^zZ~/9IPGXNi=:GqasKBoDb4c1!N5' );
define( 'AUTH_SALT',        'Gum|ryl~1.%*qmzw3Lzd(szAhJj+6sEV-e7aaM.Bi}3]RO/kA_<]Lm %n/}6}&|Y' );
define( 'SECURE_AUTH_SALT', '*CJ&X3M+-Jv6}$B<-k;1MG>B?c0VjCgzmK#JlmWK$)3r(}pu]gTf^GO,;k^iL}VD' );
define( 'LOGGED_IN_SALT',   '$]|y<-x$@j;U E%C,j.m&hRtE[j:ADG$T}S3YqSmhC&YPF./vR?DwJ .A]-jIYai' );
define( 'NONCE_SALT',       '<*JG#<`>AtK QB5<`VFiAviG5j#;n^YO%rLOIAzB^ EkNU*B<?Gjrt6ahXFTe]^3' );

/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/support/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';
