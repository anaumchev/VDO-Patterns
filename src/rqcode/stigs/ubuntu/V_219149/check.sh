#!/bin/bash
# https://www.stigviewer.com/stig/canonical_ubuntu_18.04_lts/2021-06-16/finding/V-219149
total_number=`grep "^\s*linux" /boot/grub/grub.cfg | wc -l`
secure_number=`grep "^\s*linux" /boot/grub/grub.cfg | grep "audit=1" | wc -l`
if [ $total_number -eq $secure_number ]
then
    exit 0
fi
exit -1