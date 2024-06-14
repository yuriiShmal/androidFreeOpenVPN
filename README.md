# androidFreeOpenVPN
UPDATE: Due to difficulties with linking to ics-openvpn backend, this repo will be used purely for its ui functionality
as I develop a direct derivative of ics-openvpn from a fork. 

My attempt at building an android VPN app. Will eventually become a derivative of ics-openvpn
because I am not touch the weeds of the network implementation of OpenVPN and integrating it
into Android, I'd just screw it up.

Navigation seems to be working, 

TODO:
    Link to ics-openvpn (with my single slow server)

For what it's worth, my vpn doesn't keep logs. 

__HOWEVER__: the company that is hosting the server almost *certainly* keeps logs. 

Just remember that I give absolutely no guarantee as it is out of my hands (I don't own the server
I'm just using an Always Free free virtual machine). For that reason it is also glacially slow,
but will tide over if need some slow services.

I am also planning to make use of ics-openvpn's feature that allows users to upload their
own VPN client configuration files for extra security if you want to use open-vpn access server 
(or mess around with making an open source openvpn server like I did).
