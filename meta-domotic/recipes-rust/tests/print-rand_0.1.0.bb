# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get print-rand could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/print-rand/0.1.0"
SRC_URI += "git://gitlab.com/pbarker.dev/rust/print-rand.git;protocol=https;nobranch=1;branch=dev"
SRCREV = "3397247f929f28d70adbb65d3990dc72699553bb"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""


# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/getrandom/0.1.16 \
    crate://crates.io/libc/0.2.147 \
    crate://crates.io/ppv-lite86/0.2.17 \
    crate://crates.io/rand/0.7.3 \
    crate://crates.io/rand_chacha/0.2.2 \
    crate://crates.io/rand_core/0.5.1 \
    crate://crates.io/rand_hc/0.2.0 \
    crate://crates.io/wasi/0.9.0+wasi-snapshot-preview1 \
"

SRC_URI[cfg-if-1.0.0.sha256sum] = "baf1de4339761588bc0619e3cbc0120ee582ebb74b53b4efbf79117bd2da40fd"
SRC_URI[getrandom-0.1.16.sha256sum] = "8fc3cb4d91f53b50155bdcfd23f6a4c39ae1969c2ae85982b135750cccaf5fce"
SRC_URI[libc-0.2.147.sha256sum] = "b4668fb0ea861c1df094127ac5f1da3409a82116a4ba74fca2e58ef927159bb3"
SRC_URI[ppv-lite86-0.2.17.sha256sum] = "5b40af805b3121feab8a3c29f04d8ad262fa8e0561883e7653e024ae4479e6de"
SRC_URI[rand-0.7.3.sha256sum] = "6a6b1679d49b24bbfe0c803429aa1874472f50d9b363131f0e89fc356b544d03"
SRC_URI[rand_chacha-0.2.2.sha256sum] = "f4c8ed856279c9737206bf725bf36935d8666ead7aa69b52be55af369d193402"
SRC_URI[rand_core-0.5.1.sha256sum] = "90bde5296fc891b0cef12a6d03ddccc162ce7b2aff54160af9338f8d40df6d19"
SRC_URI[rand_hc-0.2.0.sha256sum] = "ca3129af7b92a17112d59ad498c6f81eaf463253766b90396d39ea7a39d6613c"
SRC_URI[wasi-0.9.0+wasi-snapshot-preview1.sha256sum] = "cccddf32554fecc6acb585f82a32a72e28b48f8c4c1883ddfeeeaa96f7d8e519"

# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"

SUMMARY = "Print a random number"
HOMEPAGE = "https://gitlab.com/pbarker.dev/rust/print-rand.git"
LICENSE = "Apache-2.0"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include print-rand-${PV}.inc
include print-rand.inc