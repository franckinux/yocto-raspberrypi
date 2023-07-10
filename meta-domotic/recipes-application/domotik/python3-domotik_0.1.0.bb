SUMMARY = "A simple program, and an example of how to structure a python project"
AUTHOR = "Franck Barbenoire"
LICENSE = "CLOSED"
# LICENSE = "Apache-2.0"
# LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI = " \
    file://setup.py \
    file://domotik/__init__.py \
    file://domotik/main.py \
    file://domotik/other.py \
    "
S = "${WORKDIR}"

# inherit setuptools3 systemd
inherit setuptools3

RDEPENDS:${PN} += " \
    ${PYTHON_PN}-aiohttp \
"
