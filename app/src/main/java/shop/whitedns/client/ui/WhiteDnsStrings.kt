package shop.whitedns.client.ui

interface WhiteDnsStrings {
    // Tabs
    val tabProfiles: String
    val tabConnect: String
    val tabScan: String
    val tabLogs: String

    // Header / menu
    val menuVersion: String
    val menuAppSettings: String
    val menuDonate: String
    val appSettingsTitle: String
    val supportTitle: String
    val supportBody: String
    val footerPoweredBy: String

    // Buttons
    val btnClose: String
    val btnCopy: String
    val btnShare: String
    val btnCancel: String
    val btnSave: String
    val btnCreate: String
    val btnImport: String
    val btnDelete: String

    // Theme / language picker labels
    val fieldTheme: String
    val themeModeAuto: String
    val themeModeLight: String
    val themeModeDark: String
    val fieldLanguage: String
    val languageEn: String
    val languageFa: String

    // Connection mode
    val fieldMode: String
    val connectionModeProxy: String
    val connectionModeVpn: String

    // Connect button
    val connectLabel: String
    val connectingLabel: String
    val stopLabel: String

    // Connection progress (one arg versions)
    val progressPreparing: String
    val progressParallelTest: String
    val progressStarting: String
    val progressScanning: String
    val progressSelectingResolver: String
    val progressStartingSession: String
    val progressStartingRuntime: String
    val progressRetrying: String
    val progressConnected: String

    // Parameterized progress functions
    fun progressParallelTestOf(completed: Int, total: Int): String
    fun progressScanningOf(completed: Int, total: Int): String

    // Verification
    val verificationVerifying: String
    val verificationVerified: String
    val verificationNeedsAttention: String
    val verificationPending: String
    val verificationNotRunYet: String
    val verificationCheckingRoute: String

    // Banners
    val bannerVpnNotificationTitle: String
    val bannerVpnNotificationBody: String
    val bannerEnableVpnNotification: String
    val bannerBatteryTitle: String
    val bannerBatteryBody: String
    val bannerAllowBackgroundVpn: String
    val bannerFullVpnWarningTitle: String
    val bannerFullVpnWarningBody: String

    // Setup card
    val setupTitle: String
    val setupConnection: String
    val setupAddConnection: String
    val setupAddResolverProfile: String

    // Selectors
    val resolverRequiredMessage: String
    val resolverNoSavedLists: String
    val resolverNotSelected: String
    val serverRouteMissing: String
    val selectorConnectionProfiles: String
    val selectorResolverProfiles: String
    val selectorSettingProfiles: String
    val selectorSearchConnections: String
    val selectorSearchResolvers: String
    val selectorSearchSettings: String

    // Parallel Test
    val toggleParallelTest: String
    val parallelTestDescription: String
    val parallelTestYourConfigs: String
    val parallelTestWhiteDnsConfigs: String
    fun parallelTestSelectedOf(selected: Int, max: Int): String

    // Stats
    val statsActiveResolvers: String
    val statsValidResolvers: String
    val connectionLogsTitle: String

    // Profile tabs
    val profileTabConnection: String
    val profileTabResolver: String
    val profileTabSetting: String
    val profileTabConnectionHeader: String
    val profileTabResolverHeader: String
    val profileTabSettingHeader: String

    // Connection profiles
    val connectionProfilesNoProfiles: String
    val btnDeleteDups: String
    val btnExportAll: String
    val btnSaveCurrent: String
    val exportConnectionTitle: String
    val exportAllConnectionsTitle: String
    val deleteDuplicateConnectionsTitle: String
    val deleteConnectionTitle: String
    val importConnectionTitle: String
    val downloadTomlTitle: String
    val connectionProfileFieldName: String
    val connectionProfileFieldDomain: String
    val connectionProfileFieldKey: String
    val connectionProfileFieldEncryption: String
    val connectionProfileNamePlaceholder: String
    val qrUnavailable: String

    // Resolver profiles
    val resolverProfilesNoProfiles: String
    val deleteResolverTitle: String
    val resolverProfileFieldName: String
    val resolverProfileNamePlaceholder: String
    val resolverProfileFieldResolvers: String
    val resolverProfileResolversPlaceholder: String
    val resolverProfileBtnImportFile: String
    val resolverProfileBtnClear: String

    // Setting profiles
    val settingProfilesNoProfiles: String
    val importSettingsProfileTitle: String
    val exportSettingsTitle: String
    val deleteSettingTitle: String
    val settingProfileFieldName: String
    val settingProfileNamePlaceholder: String
    val importSettingsFieldName: String
    val importSettingsNamePlaceholder: String
    val importSettingsFieldToml: String

    // Advanced settings fields
    val fieldListenIp: String
    val fieldListenPort: String
    val toggleHttpProxy: String
    val fieldHttpPort: String
    val toggleSocks5Auth: String
    val fieldSocksUsername: String
    val fieldSocksPassword: String
    val fieldBalancingStrategy: String
    val fieldUploadDup: String
    val fieldDownloadDup: String
    val fieldUploadCompress: String
    val fieldDownloadCompress: String
    val toggleBaseEncode: String
    val fieldPingWatchdog: String
    val toggleTrafficWarmup: String
    val fieldWarmupProbes: String
    val fieldKeepaliveSeconds: String
    val fieldLogLevel: String
    val fieldMinUpload: String
    val fieldMinDownload: String
    val fieldMaxUpload: String
    val fieldMaxDownload: String
    val fieldResolverRetries: String
    val fieldResolverTimeout: String
    val fieldResolverParallel: String
    val fieldLogsRetries: String
    val fieldLogsTimeout: String
    val fieldLogsParallel: String
    val fieldRxTxWorkers: String
    val fieldProcessWorkers: String
    val fieldTunnelPacketTimeout: String
    val fieldIdlePoll: String
    val fieldTxChannel: String
    val fieldRxChannel: String
    val fieldUdpPool: String
    val fieldStreamQueue: String
    val fieldOrphanQueue: String
    val fieldDnsFragments: String
    val fieldSocksUdpTimeout: String
    val fieldTerminalRetain: String
    val fieldCancelledRetain: String
    val fieldRetryBase: String
    val fieldRetryStep: String
    val fieldRetryLinear: String
    val fieldRetryMax: String
    val fieldBusyRetry: String

    // Balancing / compression labels
    val balancingRandom: String
    val balancingRoundRobin: String
    val balancingLeastLoss: String
    val balancingLowestLatency: String
    val compressionOff: String
    val compressionZstd: String
    val compressionLz4: String
    val compressionZlib: String
    val startupModeAsk: String
    val startupModeFullScan: String
    val startupModeFastLogs: String

    // Encryption labels
    val encryptionNone: String
    val encryptionXor: String
    val encryptionChacha20: String
    val encryptionAes128: String
    val encryptionAes192: String
    val encryptionAes256: String

    // Split tunnel
    val splitTunnelSelectApps: String
    val splitTunnelSelected: String
    val splitTunnelNoApps: String
    val splitTunnelModeAllApps: String
    val splitTunnelModeOnlySelected: String
    val splitTunnelModeBypassSelected: String

    // Scan tab
    val scanDefaultList: String
    val scanWorkerWarning: String
    val scanBtnStart: String
    val scanBtnStop: String
    val scanStatusTitle: String
    val scanLabelTotal: String
    val scanLabelValid: String
    val scanLabelRejected: String
    val scanLabelStatus: String
    val scanLabelSource: String
    val scanLabelWorkers: String
    val scanLabelProgress: String
    val scanLabelMessage: String
    val scanResultsAutoSave: String
    val scanAutoSaveLabel: String
    val saveScanResultsTitle: String
    val scanBtnSaveAs: String
    val scanBtnResume: String
    val saveScanNamePlaceholder: String
    fun scanProfileNeedsServer(name: String): String
    fun saveScanResultsBody(resolverCount: Int, scanLabel: String): String

    // Scan status labels
    val scanStatusIdle: String
    val scanStatusReady: String
    val scanStatusStarting: String
    val scanStatusRunning: String
    val scanStatusCompleted: String
    val scanStatusFailed: String
    val scanStatusStopped: String

    // Logs
    val diagnosticsTitle: String

    // Donate crypto labels
    val cryptoUsdtTon: String
    val cryptoUsdtTrc20: String
    val cryptoUsdtErc20: String
    val cryptoUsdtSpl: String
}

object EnglishStrings : WhiteDnsStrings {
    // Tabs
    override val tabProfiles = "Profiles"
    override val tabConnect = "Connect"
    override val tabScan = "Scan"
    override val tabLogs = "Logs"

    // Header / menu
    override val menuVersion = "Version"
    override val menuAppSettings = "Settings"
    override val menuDonate = "Donate"
    override val appSettingsTitle = "App Settings"
    override val supportTitle = "Support"
    override val supportBody = "Donations will be used for new servers and app development."
    override val footerPoweredBy = "Powered by WhiteDNS"

    // Buttons
    override val btnClose = "Close"
    override val btnCopy = "Copy"
    override val btnShare = "Share"
    override val btnCancel = "Cancel"
    override val btnSave = "Save"
    override val btnCreate = "Create"
    override val btnImport = "Import"
    override val btnDelete = "Delete"

    // Theme / language picker labels
    override val fieldTheme = "Theme"
    override val themeModeAuto = "Auto"
    override val themeModeLight = "Light"
    override val themeModeDark = "Dark"
    override val fieldLanguage = "Language"
    override val languageEn = "English"
    override val languageFa = "Persian"

    // Connection mode
    override val fieldMode = "Mode"
    override val connectionModeProxy = "Proxy"
    override val connectionModeVpn = "VPN"

    // Connect button
    override val connectLabel = "Connect"
    override val connectingLabel = "Connecting..."
    override val stopLabel = "Stop"

    // Connection progress (one arg versions)
    override val progressPreparing = "Preparing connection..."
    override val progressParallelTest = "Running parallel test..."
    override val progressStarting = "Starting connection..."
    override val progressScanning = "Scanning resolvers..."
    override val progressSelectingResolver = "Selecting resolver..."
    override val progressStartingSession = "Starting session..."
    override val progressStartingRuntime = "Starting runtime..."
    override val progressRetrying = "Retrying..."
    override val progressConnected = "Connected"

    // Parameterized progress functions
    override fun progressParallelTestOf(completed: Int, total: Int): String =
        "Parallel test: $completed/$total"

    override fun progressScanningOf(completed: Int, total: Int): String =
        "Scanning: $completed/$total"

    // Verification
    override val verificationVerifying = "Verifying..."
    override val verificationVerified = "Verified"
    override val verificationNeedsAttention = "Needs attention"
    override val verificationPending = "Pending"
    override val verificationNotRunYet = "Not run yet"
    override val verificationCheckingRoute = "Checking route..."

    // Banners
    override val bannerVpnNotificationTitle = "VPN NOTIFICATION BLOCKED"
    override val bannerVpnNotificationBody = "Enable WhiteDNS notifications so Android can keep the full VPN service visible and running in the background."
    override val bannerEnableVpnNotification = "ENABLE VPN NOTIFICATION"
    override val bannerBatteryTitle = "BACKGROUND VPN MAY STOP"
    override val bannerBatteryBody = "Allow WhiteDNS to ignore battery optimization so the VPN keeps running after you leave the app."
    override val bannerAllowBackgroundVpn = "ALLOW BACKGROUND VPN"
    override val bannerFullVpnWarningTitle = "FULL VPN PERFORMANCE WARNING"
    override val bannerFullVpnWarningBody = "Full VPN routes all device traffic through the DNS tunnel and may be slower or less stable. Proxy Mode is recommended for best performance."

    // Setup card
    override val setupTitle = "Setup"
    override val setupConnection = "Connection"
    override val setupAddConnection = "Add Connection"
    override val setupAddResolverProfile = "Add Resolver Profile"

    // Selectors
    override val resolverRequiredMessage = "You need resolvers to connect."
    override val resolverNoSavedLists = "No saved lists"
    override val resolverNotSelected = "Not selected"
    override val serverRouteMissing = "Server route missing"
    override val selectorConnectionProfiles = "Connection Profiles"
    override val selectorResolverProfiles = "Resolver Profiles"
    override val selectorSettingProfiles = "Setting Profiles"
    override val selectorSearchConnections = "Search connections"
    override val selectorSearchResolvers = "Search resolvers"
    override val selectorSearchSettings = "Search setting profiles"

    // Parallel Test
    override val toggleParallelTest = "Parallel Test"
    override val parallelTestDescription = "Parallel Test starts selected configs as temporary SOCKS proxies, measures speed and ping after each tunnel is ready, then connects with the best result. In Full VPN mode, the test still runs through SOCKS first and starts the Android VPN after a result is selected."
    override val parallelTestYourConfigs = "Your configs"
    override val parallelTestWhiteDnsConfigs = "WhiteDNS configs"
    override fun parallelTestSelectedOf(selected: Int, max: Int): String =
        "Selected $selected/$max"

    // Stats
    override val statsActiveResolvers = "Active Resolvers"
    override val statsValidResolvers = "Valid Resolvers"
    override val connectionLogsTitle = "Connection Logs"

    // Profile tabs
    override val profileTabConnection = "Connection"
    override val profileTabResolver = "Resolver"
    override val profileTabSetting = "Setting"
    override val profileTabConnectionHeader = "CONNECTION PROFILES"
    override val profileTabResolverHeader = "RESOLVER PROFILES"
    override val profileTabSettingHeader = "SETTING PROFILES"

    // Connection profiles
    override val connectionProfilesNoProfiles = "No connection profiles found."
    override val btnDeleteDups = "Delete Duplicates"
    override val btnExportAll = "Export All"
    override val btnSaveCurrent = "Save Current"
    override val exportConnectionTitle = "Export Connection"
    override val exportAllConnectionsTitle = "Export All Connections"
    override val deleteDuplicateConnectionsTitle = "Delete Duplicate Connections"
    override val deleteConnectionTitle = "Delete Connection"
    override val importConnectionTitle = "Import Connection"
    override val downloadTomlTitle = "DOWNLOAD TOML"
    override val connectionProfileFieldName = "Name"
    override val connectionProfileFieldDomain = "Server Domain"
    override val connectionProfileFieldKey = "Server Key"
    override val connectionProfileFieldEncryption = "Encryption"
    override val connectionProfileNamePlaceholder = "Connection name"
    override val qrUnavailable = "QR code unavailable for this profile link."

    // Resolver profiles
    override val resolverProfilesNoProfiles = "No resolver profiles found."
    override val deleteResolverTitle = "Delete Resolver"
    override val resolverProfileFieldName = "Name"
    override val resolverProfileNamePlaceholder = "Resolver name"
    override val resolverProfileFieldResolvers = "Resolvers"
    override val resolverProfileResolversPlaceholder = "Enter resolver IPs (one per line)"
    override val resolverProfileBtnImportFile = "Import File"
    override val resolverProfileBtnClear = "Clear"

    // Setting profiles
    override val settingProfilesNoProfiles = "No setting profiles found."
    override val importSettingsProfileTitle = "Import Settings Profile"
    override val exportSettingsTitle = "Export Settings"
    override val deleteSettingTitle = "Delete Settings"
    override val settingProfileFieldName = "Name"
    override val settingProfileNamePlaceholder = "Settings name"
    override val importSettingsFieldName = "Profile Name"
    override val importSettingsNamePlaceholder = "Enter name"
    override val importSettingsFieldToml = "TOML"

    // Advanced settings fields
    override val fieldListenIp = "Listen IP"
    override val fieldListenPort = "Listen Port"
    override val toggleHttpProxy = "HTTP Proxy"
    override val fieldHttpPort = "HTTP Port"
    override val toggleSocks5Auth = "SOCKS5 Authentication"
    override val fieldSocksUsername = "SOCKS Username"
    override val fieldSocksPassword = "SOCKS Password"
    override val fieldBalancingStrategy = "Balancing Strategy"
    override val fieldUploadDup = "Upload Dup"
    override val fieldDownloadDup = "Download Dup"
    override val fieldUploadCompress = "Upload Compress"
    override val fieldDownloadCompress = "Download Compress"
    override val toggleBaseEncode = "Base Encode Data"
    override val fieldPingWatchdog = "Ping Watchdog (s)"
    override val toggleTrafficWarmup = "Traffic Warmup"
    override val fieldWarmupProbes = "Warmup Probes"
    override val fieldKeepaliveSeconds = "Keepalive (s)"
    override val fieldLogLevel = "Log Level"
    override val fieldMinUpload = "Min Upload"
    override val fieldMinDownload = "Min Download"
    override val fieldMaxUpload = "Max Upload"
    override val fieldMaxDownload = "Max Download"
    override val fieldResolverRetries = "Resolver Retries"
    override val fieldResolverTimeout = "Resolver Timeout"
    override val fieldResolverParallel = "Resolver Parallel"
    override val fieldLogsRetries = "Logs Retries"
    override val fieldLogsTimeout = "Logs Timeout"
    override val fieldLogsParallel = "Logs Parallel"
    override val fieldRxTxWorkers = "RX/TX Workers"
    override val fieldProcessWorkers = "Process Workers"
    override val fieldTunnelPacketTimeout = "Tunnel Packet Timeout"
    override val fieldIdlePoll = "Idle Poll"
    override val fieldTxChannel = "TX Channel"
    override val fieldRxChannel = "RX Channel"
    override val fieldUdpPool = "UDP Pool"
    override val fieldStreamQueue = "Stream Queue"
    override val fieldOrphanQueue = "Orphan Queue"
    override val fieldDnsFragments = "DNS Fragments"
    override val fieldSocksUdpTimeout = "SOCKS UDP Timeout"
    override val fieldTerminalRetain = "Terminal Retain"
    override val fieldCancelledRetain = "Cancelled Retain"
    override val fieldRetryBase = "Retry Base"
    override val fieldRetryStep = "Retry Step"
    override val fieldRetryLinear = "Retry Linear"
    override val fieldRetryMax = "Retry Max"
    override val fieldBusyRetry = "Busy Retry"

    // Balancing / compression labels
    override val balancingRandom = "Random"
    override val balancingRoundRobin = "Round Robin"
    override val balancingLeastLoss = "Least Loss"
    override val balancingLowestLatency = "Lowest Latency"
    override val compressionOff = "Off"
    override val compressionZstd = "Zstd"
    override val compressionLz4 = "LZ4"
    override val compressionZlib = "Zlib"
    override val startupModeAsk = "Ask"
    override val startupModeFullScan = "Full Scan"
    override val startupModeFastLogs = "Fast Logs"

    // Encryption labels
    override val encryptionNone = "None"
    override val encryptionXor = "XOR"
    override val encryptionChacha20 = "ChaCha20"
    override val encryptionAes128 = "AES-128"
    override val encryptionAes192 = "AES-192"
    override val encryptionAes256 = "AES-256"

    // Split tunnel
    override val splitTunnelSelectApps = "Select Apps"
    override val splitTunnelSelected = "Selected"
    override val splitTunnelNoApps = "No apps selected"
    override val splitTunnelModeAllApps = "All Apps"
    override val splitTunnelModeOnlySelected = "Only Selected"
    override val splitTunnelModeBypassSelected = "Bypass Selected"

    // Scan tab
    override val scanDefaultList = "Default List"
    override val scanWorkerWarning = "Higher worker values increase battery usage and can impact phone performance."
    override val scanBtnStart = "Start"
    override val scanBtnStop = "Stop"
    override val scanStatusTitle = "Scan Status"
    override val scanLabelTotal = "Total"
    override val scanLabelValid = "Valid"
    override val scanLabelRejected = "Rejected"
    override val scanLabelStatus = "Status"
    override val scanLabelSource = "Source"
    override val scanLabelWorkers = "Workers"
    override val scanLabelProgress = "Progress"
    override val scanLabelMessage = "Message"
    override val scanResultsAutoSave = "Auto Save Results"
    override val scanAutoSaveLabel = "Auto Save"
    override val saveScanResultsTitle = "Save Scan Results"
    override val scanBtnSaveAs = "Save As"
    override val scanBtnResume = "Resume"
    override val saveScanNamePlaceholder = "Scan results name"
    override fun scanProfileNeedsServer(name: String): String =
        "$name needs a server route and key."
    override fun saveScanResultsBody(resolverCount: Int, scanLabel: String): String =
        "$resolverCount valid resolvers from $scanLabel will be saved as a new resolver profile."

    // Scan status labels
    override val scanStatusIdle = "Idle"
    override val scanStatusReady = "Ready"
    override val scanStatusStarting = "Starting"
    override val scanStatusRunning = "Running"
    override val scanStatusCompleted = "Completed"
    override val scanStatusFailed = "Failed"
    override val scanStatusStopped = "Stopped"

    // Logs
    override val diagnosticsTitle = "Diagnostics"

    // Donate crypto labels
    override val cryptoUsdtTon = "USDT (TON)"
    override val cryptoUsdtTrc20 = "USDT (TRC-20)"
    override val cryptoUsdtErc20 = "USDT (ERC-20)"
    override val cryptoUsdtSpl = "USDT (SPL)"
}

object PersianStrings : WhiteDnsStrings {
    // Tabs
    override val tabProfiles = "پروفایل‌ها"
    override val tabConnect = "اتصال"
    override val tabScan = "اسکن"
    override val tabLogs = "لاگ‌ها"

    // Header / menu
    override val menuVersion = "نسخه"
    override val menuAppSettings = "تنظیمات"
    override val menuDonate = "حمایت مالی"
    override val appSettingsTitle = "تنظیمات برنامه"
    override val supportTitle = "پشتیبانی"
    override val supportBody = "اهدای مال برای سرورهای جدید و توسعه برنامه استفاده خواهد شد."
    override val footerPoweredBy = "توسط WhiteDNS ساخته شده"

    // Buttons
    override val btnClose = "بستن"
    override val btnCopy = "کپی"
    override val btnShare = "اشتراک"
    override val btnCancel = "لغو"
    override val btnSave = "ذخیره"
    override val btnCreate = "ایجاد"
    override val btnImport = "وارد کردن"
    override val btnDelete = "حذف"

    // Theme / language picker labels
    override val fieldTheme = "تم"
    override val themeModeAuto = "خودکار"
    override val themeModeLight = "روشن"
    override val themeModeDark = "تاریک"
    override val fieldLanguage = "زبان"
    override val languageEn = "انگلیسی"
    override val languageFa = "فارسی"

    // Connection mode
    override val fieldMode = "حالت"
    override val connectionModeProxy = "پروکسی"
    override val connectionModeVpn = "VPN"

    // Connect button
    override val connectLabel = "اتصال"
    override val connectingLabel = "در حال اتصال..."
    override val stopLabel = "قطع"

    // Connection progress (one arg versions)
    override val progressPreparing = "آماده‌سازی اتصال..."
    override val progressParallelTest = "اجرای تست موازی..."
    override val progressStarting = "شروع اتصال..."
    override val progressScanning = "اسکن رزولورها..."
    override val progressSelectingResolver = "انتخاب رزولور..."
    override val progressStartingSession = "شروع جلسه..."
    override val progressStartingRuntime = "شروع زمان اجرا..."
    override val progressRetrying = "تلاش مجدد..."
    override val progressConnected = "متصل"

    // Parameterized progress functions
    override fun progressParallelTestOf(completed: Int, total: Int): String =
        "تست موازی: $completed/$total"

    override fun progressScanningOf(completed: Int, total: Int): String =
        "اسکن: $completed/$total"

    // Verification
    override val verificationVerifying = "در حال تأیید..."
    override val verificationVerified = "تأیید شد"
    override val verificationNeedsAttention = "نیاز به توجه"
    override val verificationPending = "در انتظار"
    override val verificationNotRunYet = "هنوز اجرا نشده"
    override val verificationCheckingRoute = "بررسی مسیر..."

    // Banners
    override val bannerVpnNotificationTitle = "فعال کردن اعلان VPN"
    override val bannerVpnNotificationBody = "اجازه اعلان‌ها برای وضعیت VPN"
    override val bannerEnableVpnNotification = "فعال کردن اعلان VPN"
    override val bannerBatteryTitle = "VPN در پس‌زمینه ممکن است متوقف شود"
    override val bannerBatteryBody = "اجازه دهید WhiteDNS بهینه‌سازی باتری را نادیده بگیرد تا VPN بعد از ترک برنامه کار کند."
    override val bannerAllowBackgroundVpn = "اجازه VPN در پس‌زمینه"
    override val bannerFullVpnWarningTitle = "هشدار عملکرد VPN کامل"
    override val bannerFullVpnWarningBody = "VPN کامل تمام ترافیک دستگاه را از طریق تونل DNS هدایت می‌کند و ممکن است کندتر یا کمتر پایدار باشد. حالت Proxy برای بهترین عملکرد توصیه می‌شود."

    // Setup card
    override val setupTitle = "تنظیم"
    override val setupConnection = "اتصال"
    override val setupAddConnection = "افزودن اتصال"
    override val setupAddResolverProfile = "افزودن پروفایل رزولور"

    // Selectors
    override val resolverRequiredMessage = "برای اتصال به رزولورها نیاز دارید."
    override val resolverNoSavedLists = "لیستی ذخیره نشده"
    override val resolverNotSelected = "انتخاب نشده"
    override val serverRouteMissing = "مسیر سرور گم شده"
    override val selectorConnectionProfiles = "پروفایل‌های اتصال"
    override val selectorResolverProfiles = "پروفایل‌های رزولور"
    override val selectorSettingProfiles = "پروفایل‌های تنظیمات"
    override val selectorSearchConnections = "جستجو در اتصالات"
    override val selectorSearchResolvers = "جستجو در رزولورها"
    override val selectorSearchSettings = "جستجو در پروفایل‌های تنظیمات"

    // Parallel Test
    override val toggleParallelTest = "تست موازی"
    override val parallelTestDescription = "تست موازی پروفایل‌های انتخاب شده را به عنوان پروکسی‌های SOCKS موقت شروع می‌کند، سرعت و پینگ را بعد از آماده شدن هر تونل اندازه‌گیری می‌کند، سپس بهترین نتیجه را اتصال می‌دهد. در حالت VPN کامل، تست همچنان از طریق SOCKS انجام می‌شود و پس از انتخاب نتیجه، Android VPN شروع می‌شود."
    override val parallelTestYourConfigs = "پروفایل‌های شما"
    override val parallelTestWhiteDnsConfigs = "پروفایل‌های WhiteDNS"
    override fun parallelTestSelectedOf(selected: Int, max: Int): String =
        "انتخاب شده $selected/$max"

    // Stats
    override val statsActiveResolvers = "رزولورهای فعال"
    override val statsValidResolvers = "رزولورهای معتبر"
    override val connectionLogsTitle = "لاگ‌های اتصال"

    // Profile tabs
    override val profileTabConnection = "اتصال"
    override val profileTabResolver = "رزولور"
    override val profileTabSetting = "تنظیم"
    override val profileTabConnectionHeader = "پروفایل‌های اتصال"
    override val profileTabResolverHeader = "پروفایل‌های رزولور"
    override val profileTabSettingHeader = "پروفایل‌های تنظیمات"

    // Connection profiles
    override val connectionProfilesNoProfiles = "هیچ پروفایل اتصالی یافت نشد."
    override val btnDeleteDups = "حذف تکراری‌ها"
    override val btnExportAll = "صادر کردن همه"
    override val btnSaveCurrent = "ذخیره فعلی"
    override val exportConnectionTitle = "صادر کردن اتصال"
    override val exportAllConnectionsTitle = "صادر کردن تمام اتصالات"
    override val deleteDuplicateConnectionsTitle = "حذف اتصالات تکراری"
    override val deleteConnectionTitle = "حذف اتصال"
    override val importConnectionTitle = "وارد کردن اتصال"
    override val downloadTomlTitle = "دانلود TOML"
    override val connectionProfileFieldName = "نام"
    override val connectionProfileFieldDomain = "دامنه سرور"
    override val connectionProfileFieldKey = "کلید سرور"
    override val connectionProfileFieldEncryption = "رمزگذاری"
    override val connectionProfileNamePlaceholder = "نام اتصال"
    override val qrUnavailable = "کد QR برای این پیوند پروفایل در دسترس نیست."

    // Resolver profiles
    override val resolverProfilesNoProfiles = "هیچ پروفایل رزولور یافت نشد."
    override val deleteResolverTitle = "حذف رزولور"
    override val resolverProfileFieldName = "نام"
    override val resolverProfileNamePlaceholder = "نام رزولور"
    override val resolverProfileFieldResolvers = "رزولورها"
    override val resolverProfileResolversPlaceholder = "IP رزولورها را وارد کنید (یکی در هر خط)"
    override val resolverProfileBtnImportFile = "وارد کردن فایل"
    override val resolverProfileBtnClear = "پاک کردن"

    // Setting profiles
    override val settingProfilesNoProfiles = "هیچ پروفایل تنظیمات یافت نشد."
    override val importSettingsProfileTitle = "وارد کردن پروفایل تنظیمات"
    override val exportSettingsTitle = "صادر کردن تنظیمات"
    override val deleteSettingTitle = "حذف تنظیمات"
    override val settingProfileFieldName = "نام"
    override val settingProfileNamePlaceholder = "نام تنظیمات"
    override val importSettingsFieldName = "نام پروفایل"
    override val importSettingsNamePlaceholder = "نام را وارد کنید"
    override val importSettingsFieldToml = "TOML"

    // Advanced settings fields
    override val fieldListenIp = "IP گوش دادن"
    override val fieldListenPort = "پورت گوش دادن"
    override val toggleHttpProxy = "پروکسی HTTP"
    override val fieldHttpPort = "پورت HTTP"
    override val toggleSocks5Auth = "احراز هویت SOCKS5"
    override val fieldSocksUsername = "نام کاربری SOCKS"
    override val fieldSocksPassword = "رمز عبور SOCKS"
    override val fieldBalancingStrategy = "استراتژی متعادل‌کردن"
    override val fieldUploadDup = "آپلود Dup"
    override val fieldDownloadDup = "دانلود Dup"
    override val fieldUploadCompress = "فشرده‌سازی آپلود"
    override val fieldDownloadCompress = "فشرده‌سازی دانلود"
    override val toggleBaseEncode = "رمزگذاری داده‌ها"
    override val fieldPingWatchdog = "Ping Watchdog"
    override val toggleTrafficWarmup = "گرم‌کردن ترافیک"
    override val fieldWarmupProbes = "بررسی‌های گرم‌کردن"
    override val fieldKeepaliveSeconds = "Keepalive (s)"
    override val fieldLogLevel = "سطح لاگ"
    override val fieldMinUpload = "حداقل آپلود"
    override val fieldMinDownload = "حداقل دانلود"
    override val fieldMaxUpload = "حداکثر آپلود"
    override val fieldMaxDownload = "حداکثر دانلود"
    override val fieldResolverRetries = "تلاش‌های رزولور"
    override val fieldResolverTimeout = "تایم‌اوت رزولور"
    override val fieldResolverParallel = "رزولور موازی"
    override val fieldLogsRetries = "تلاش‌های لاگ"
    override val fieldLogsTimeout = "تایم‌اوت لاگ"
    override val fieldLogsParallel = "لاگ موازی"
    override val fieldRxTxWorkers = "کارگران RxTx"
    override val fieldProcessWorkers = "کارگران فرایند"
    override val fieldTunnelPacketTimeout = "تایم‌اوت بسته تونل"
    override val fieldIdlePoll = "Idle Poll"
    override val fieldTxChannel = "کانال TX"
    override val fieldRxChannel = "کانال RX"
    override val fieldUdpPool = "مخزن UDP"
    override val fieldStreamQueue = "صف جریان"
    override val fieldOrphanQueue = "صف Orphan"
    override val fieldDnsFragments = "قطعات DNS"
    override val fieldSocksUdpTimeout = "تایم‌اوت SOCKS UDP"
    override val fieldTerminalRetain = "حفظ Terminal"
    override val fieldCancelledRetain = "حفظ لغو شده"
    override val fieldRetryBase = "پایه تلاش مجدد"
    override val fieldRetryStep = "مرحله تلاش مجدد"
    override val fieldRetryLinear = "تلاش مجدد خطی"
    override val fieldRetryMax = "حداکثر تلاش مجدد"
    override val fieldBusyRetry = "تلاش مجدد شلوغ"

    // Balancing / compression labels
    override val balancingRandom = "تصادفی"
    override val balancingRoundRobin = "دوران کردن"
    override val balancingLeastLoss = "کمترین افت"
    override val balancingLowestLatency = "کمترین تاخیر"
    override val compressionOff = "خاموش"
    override val compressionZstd = "Zstd"
    override val compressionLz4 = "LZ4"
    override val compressionZlib = "Zlib"
    override val startupModeAsk = "پرسش"
    override val startupModeFullScan = "اسکن کامل"
    override val startupModeFastLogs = "لاگ‌های سریع"

    // Encryption labels
    override val encryptionNone = "هیچ"
    override val encryptionXor = "XOR"
    override val encryptionChacha20 = "ChaCha20"
    override val encryptionAes128 = "AES-128"
    override val encryptionAes192 = "AES-192"
    override val encryptionAes256 = "AES-256"

    // Split tunnel
    override val splitTunnelSelectApps = "انتخاب برنامه‌ها"
    override val splitTunnelSelected = "انتخاب شده"
    override val splitTunnelNoApps = "هیچ برنامه‌ای انتخاب نشده"
    override val splitTunnelModeAllApps = "تمام برنامه‌ها"
    override val splitTunnelModeOnlySelected = "فقط انتخاب شده"
    override val splitTunnelModeBypassSelected = "دور زدن انتخاب شده"

    // Scan tab
    override val scanDefaultList = "لیست پیشفرض"
    override val scanWorkerWarning = "مقادیر کارگر بالاتر باعث افزایش مصرف باتری و می‌تواند بر عملکرد تلفن تأثیر بگذارد."
    override val scanBtnStart = "شروع"
    override val scanBtnStop = "متوقف کردن"
    override val scanStatusTitle = "وضعیت اسکن"
    override val scanLabelTotal = "کل"
    override val scanLabelValid = "معتبر"
    override val scanLabelRejected = "رد شده"
    override val scanLabelStatus = "وضعیت"
    override val scanLabelSource = "منبع"
    override val scanLabelWorkers = "کارگران"
    override val scanLabelProgress = "پیشرفت"
    override val scanLabelMessage = "پیام"
    override val scanResultsAutoSave = "ذخیره خودکار نتایج"
    override val scanAutoSaveLabel = "ذخیره خودکار"
    override val saveScanResultsTitle = "ذخیره نتایج اسکن"
    override val scanBtnSaveAs = "ذخیره به عنوان"
    override val scanBtnResume = "از سر گیری"
    override val saveScanNamePlaceholder = "نام نتایج اسکن"
    override fun scanProfileNeedsServer(name: String): String =
        "$name به مسیر سرور و کلید نیاز دارد."
    override fun saveScanResultsBody(resolverCount: Int, scanLabel: String): String =
        "$resolverCount رزولور معتبر از $scanLabel به عنوان یک پروفایل رزولور جدید ذخیره خواهد شد."

    // Scan status labels
    override val scanStatusIdle = "بیکار"
    override val scanStatusReady = "آماده"
    override val scanStatusStarting = "در حال شروع"
    override val scanStatusRunning = "در حال اجرا"
    override val scanStatusCompleted = "تکمیل شد"
    override val scanStatusFailed = "ناموفق"
    override val scanStatusStopped = "متوقف شد"

    // Logs
    override val diagnosticsTitle = "تشخیص‌ها"

    // Donate crypto labels
    override val cryptoUsdtTon = "USDT (TON)"
    override val cryptoUsdtTrc20 = "USDT (TRC-20)"
    override val cryptoUsdtErc20 = "USDT (ERC-20)"
    override val cryptoUsdtSpl = "USDT (SPL)"
}
