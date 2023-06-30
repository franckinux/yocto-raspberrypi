SUMMARY = "A simple program, and an example of how to structure a python project"
AUTHOR = "David Barnett"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=5c94767cedb5d6987c902ac850ded2c6"

# in development phase, use the latest commit
SRCREV = "${AUTOREV}"
PV = "0.1.0+git${SRCPV}"

# SRCREV = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"
SRC_URI = "http://github.com/dbarnett/python-helloworld"
# SRC_URI[sha256sum] = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"

S = "${WORKDIR}/git"

inherit setuptools3
