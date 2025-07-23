# EcoFlick

EcoFlick is a mobile and web application that encourages sustainable behavior by letting users upload photos of their recycling efforts and earn rewards. By gamifying recycling, EcoFlick motivates communities to reduce waste and protect the planet.

---

## Table of Contents

1. [Features](#features)
2. [Demo](#demo)
3. [Getting Started](#getting-started)

   * [Prerequisites](#prerequisites)
   * [Installation](#installation)
   * [Running the App](#running-the-app)
4. [Usage](#usage)

   * [Uploading a Photo](#uploading-a-photo)
   * [Earning Rewards](#earning-rewards)
5. [Roadmap](#roadmap)
6. [Contributing](#contributing)
7. [License](#license)

---

## Features

* **Photo Upload**: Snap a photo of your recycling activity and upload it directly.
* **Reward System**: Earn points, badges, and discounts at partner stores.
* **Leaderboard**: Track your impact and compete with friends.
* **Community Challenges**: Join local and global recycling challenges.
* **Analytics Dashboard**: Visualize your cumulative waste reduction over time.
* **Seamless Authentication**: Secure sign-up/sign-in via email or social providers.

---

## Demo

![EcoFlick Screenshot](docs/screenshot.png)

> *Sample screenshot of the recycling upload screen and rewards dashboard.*

---

## Getting Started

Follow these steps to set up EcoFlick locally.

### Prerequisites

* **Node.js** v14 or higher
* **npm** v6 or higher
* **MongoDB** v4.4+
* **Android Studio** or **Xcode** (for mobile development)

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/your-org/ecoflick.git
   cd ecoflick
   ```

2. **Install dependencies**

   ```bash
   npm install
   ```

3. **Configure environment**

   * Copy `.env.example` to `.env`
   * Set your MongoDB URI, JWT secret, and reward API keys in `.env`

### Running the App

* **Start the backend**

  ```bash
  npm run server
  ```

* **Start the web client**

  ```bash
  npm run client
  ```

* **Run mobile app (Android)**

  ```bash
  cd mobile
  npx react-native run-android
  ```

* **Run mobile app (iOS)**

  ```bash
  cd mobile
  npx react-native run-ios
  ```

---

## Usage

### Uploading a Photo

1. Log in to your EcoFlick account.
2. Navigate to the **Recycle** tab.
3. Tap **Upload Photo**, select or take a picture of your recycling.
4. Submit and wait for verification (automatic/form-based moderation).

### Earning Rewards

* **Points**: 10 points per verified photo.
* **Badges**: Unlock badges at milestones (50, 100, 500 photos).
* **Partner Discounts**: Redeem points for coupons at local stores.
* **Leaderboard**: Top recyclers appear on weekly and monthly boards.

---

## Roadmap

* [ ] Automated image recognition for faster verification
* [ ] Social sharing (Facebook, Twitter, Instagram)
* [ ] Expanded reward partner network
* [ ] Referrals and friend invites
* [ ] Dark mode and accessibility improvements

---

## Contributing

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/my-feature`)
3. Commit your changes (`git commit -am 'Add new feature'`)
4. Push to the branch (`git push origin feature/my-feature`)
5. Open a Pull Request

Please review our [CONTRIBUTING.md](CONTRIBUTING.md) for more details.

---

## License

This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
