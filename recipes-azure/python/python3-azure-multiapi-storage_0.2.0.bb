inherit pypi setuptools3
require python-azure-multiapi-storage.inc

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-asyncio \
"

distutils3_do_install_append() {
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/azure/__init__.py
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/azure/__init__.pyc
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/azure/__pycache__
}
