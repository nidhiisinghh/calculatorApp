# 🧮 Calculator MVVM

A beautiful and simple Android calculator app built with **MVVM Architecture** using **Kotlin** and **Material Design**. This project demonstrates clean architecture principles and modern Android development practices.

## ✨ Features

- 🎯 **Simple Addition Calculator** - Clean and intuitive user interface
- 🏗️ **MVVM Architecture** - Separation of concerns with proper data flow
- 🎨 **Material Design** - Beautiful UI with Material Cards and modern styling
- 📱 **Responsive Layout** - Optimized for different screen sizes
- 🔢 **Input Validation** - Handles invalid inputs gracefully
- 🚀 **Edge-to-Edge Display** - Modern Android UI experience

## 🏗️ Architecture

This app follows the **Model-View-ViewModel (MVVM)** architectural pattern:

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│      View       │───▶│   ViewModel     │───▶│     Model       │
│  (MainActivity) │    │(CalculatorVM)   │    │(CalculatorData) │
│                 │◀───│                 │◀───│                 │
└─────────────────┘    └─────────────────┘    └─────────────────┘
```

### 📁 Project Structure

```
app/src/main/java/com/example/calculatormmvm/
├── 📁 model/
│   └── CalculatorData.kt          # Data class for calculator operations
├── 📁 view/
│   └── MainActivity.kt            # UI layer handling user interactions
└── 📁 viewmodel/
    └── CalculatorViewModel.kt     # Business logic and state management
```

## 🛠️ Tech Stack

- **Language**: Kotlin
- **Architecture**: MVVM (Model-View-ViewModel)
- **UI**: Material Design Components
- **View Binding**: Enabled for type-safe view references
- **Minimum SDK**: 24 (Android 7.0)
- **Target SDK**: 35 (Android 14)
- **Build Tool**: Gradle with Kotlin DSL

```

## 🚀 Getting Started

### Prerequisites

- Android Studio Arctic Fox or later
- JDK 11 or higher
- Android SDK with API level 24+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/calculator-mvvm.git
   cd calculator-mvvm
   ```

2. **Open in Android Studio**
   - Launch Android Studio
   - Choose "Open an existing project"
   - Navigate to the cloned directory and select it

3. **Build and Run**
   - Wait for Gradle sync to complete
   - Click the "Run" button or press `Shift + F10`
   - Choose your target device/emulator

## 💡 How It Works

### Data Flow

1. **User Input**: User enters two numbers in the input fields
2. **View Layer**: MainActivity captures the input and button click
3. **ViewModel**: CalculatorViewModel processes the calculation logic
4. **Model**: CalculatorData holds the calculation result
5. **UI Update**: Result is displayed in the TextView

### Key Components

#### 🎯 CalculatorData (Model)
```kotlin
data class CalculatorData(
    val num1: Int,
    val num2: Int,
    val sum: Int
)
```

#### 🧠 CalculatorViewModel
```kotlin
class CalculatorViewModel : ViewModel() {
    fun calculateSum(num1: Int, num2: Int): CalculatorData {
        val sum = num1 + num2
        return CalculatorData(num1, num2, sum)
    }
}
```

#### 👀 MainActivity (View)
- Handles UI interactions
- Binds data to views using View Binding
- Observes ViewModel for state changes

## 🎨 UI Design

The app features a clean, modern design with:

- **Color Scheme**: Pink gradient background (`#D76C82`) with dark red button (`#A31D1D`)
- **Material Cards**: Elevated cards with rounded corners for input section
- **Typography**: Bold, large text for clear readability
- **Spacing**: Proper margins and padding for comfortable user experience
