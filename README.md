# 🧑‍🌾 NoVillagerTrading

A lightweight **Minecraft Spigot/Paper plugin** that completely **disables trading with villagers**.  
Perfect for survival, economy, or hardcore servers where villager trading should be restricted or replaced with other systems.

---

## ⚙️ Features

- 🚫 Prevents players from opening the **villager trading interface**  
- 💬 Sends a message to players when they attempt to trade  
- ⚡ Lightweight and efficient — no commands or dependencies  
- 🔒 Great for economy servers that use custom shop systems  

---

## 📁 Installation

1. Download the plugin `.jar` file  
2. Place it in your server’s `plugins/` folder  
3. Start or reload your server — it works right away!  

---

## ⚙️ Configuration (`config.yml`)

```yaml
# Enable or disable Totem blocking
NoTotems: true
```

---

## 💬 Example Message

When a player tries to trade with a villager:

> §cTrading with villagers is disabled!

You can change this message in the source code if needed.

---

## 🧩 Developer Information

**Main class:**  
`de.scholle.noVillagerTrading.NoVillagerTrading`

**Event listener:**  
`de.scholle.noVillagerTrading.VillagerTradeBlocker`

**Event used:**  
`PlayerInteractEntityEvent`

---

## 🧰 Compatibility

- ✅ Works on **Spigot**, **Paper**, and **Purpur**  
- 🧱 Compatible with **Minecraft 1.18+**  
- ⚙️ Requires **Java 17+**

---

## 🧑‍💻 Author

**Developed by:** Scholle  
**Package:** `de.scholle.noVillagerTrading`
