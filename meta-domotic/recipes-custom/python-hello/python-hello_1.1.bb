SUMMARY = "Python Hello World for Yocto tutotial"
SECTION = "custom"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI  = "file://python-hello.py"

RDEPENDS:python-hello += "python3-core"
RDEPENDS:python-hello += "python3-modules"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${WORKDIR}/python-hello.py ${D}${bindir}

}

FILES_${PN} += "${bindir}/python-hello.py"
