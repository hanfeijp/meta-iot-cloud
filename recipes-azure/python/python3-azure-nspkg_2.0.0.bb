inherit setuptools3
require python-azure-nspkg.inc

FILES_${PN} += "\
    ${PYTHON_SITEPACKAGES_DIR}/azure/__pycache__ \
"
