# Tale of Two Axes

**Tale of Two Axes** is a Java-based project designed to analyze deforestation and afforestation trends, focusing on Ghana. By leveraging datasets and user interaction, the system provides insights into forest cover loss, annual tree loss, and afforestation efforts, highlighting key environmental changes over time. 

## Features

- **Deforestation Analysis**:
  - View deforestation rates for specific regions.
  - Analyze tree cover loss and forest degradation trends.
- **Afforestation Analysis**:
  - Assess afforestation rates and their impact on mitigating deforestation.
- **Data Visualization**:
  - Display results in a user-friendly terminal interface.
- **Open Educational Resources**:
  - Link to a curated YouTube playlist on deforestation in Ghana.

## Key Classes and Functionality

1. **RegionData**:
   - Display tree cover loss for specific years (2001–2020).
   - Retrieve data by region name.
2. **OpenYoutubeVideo**:
   - Opens a YouTube playlist on deforestation using the desktop browser.
3. **DeforestationAnalyse**:
   - Extracts and processes data on forest and tree cover loss.
   - Provides deforestation insights for specific regions or overall trends.
4. **TreeLossPerYear**:
   - Displays data on annual tree cover loss by user-selected year.
5. **ForestLossPerYear**:
   - Stores forest loss data in a 2D array.
   - Displays annual forest loss data or alerts if the year is unavailable.
6. **AfforestationAnalyse**:
   - Estimates and analyzes afforestation rates to evaluate their impact.
7. **DataReader**:
   - Reads data from CSV files and preprocesses it for other classes.
8. **DataDisplay**:
   - Provides a menu-driven system for users to access the program's functionalities.

## System Requirements

- **Platform**: Any system with Java installed.
- **Languages**: Java
- **Dependencies**: CSV files containing deforestation and afforestation data.

## Installation and Usage

1. Clone the repository:
   ```bash
   git clone https://github.com/gilberttetteh/tale-of-two-axes.git
   ```
2. Compile the Java files:
   ```bash
   javac Main.java
   ```
3. Run the application:
   ```bash
   java Main
   ```

## Contributors

This project was collaboratively developed by:
- [Gilbert Tetteh](https://github.com/gilberttetteh): Developed visualization classes and YouTube video integration.
- [Sedem Abla Agudetse](https://github.com/sedemabla): Created deforestation analysis tools and tree loss per year functionality.
- [Zoie Atakora](https://github.com/zoiemabyy): Implemented forest loss and afforestation analysis.
- [Andre Ayiku](https://github.com/AndreAyiku): Designed the main class and core data processing framework.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
