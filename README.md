```markdown
# Volume Quick

Small Android utility that shows the system volume UI when tapped (from launcher icon or Quick Settings tile).

How to build (already configured)
- Push to main on GitHub.
- A GitHub Actions workflow (in `.github/workflows/build.yml`) will build an APK automatically.
- Download the artifact from the Actions run and install it on your phone for testing.

Notes
- The Quick Settings tile must be added manually via the QS edit UI.
- The app finishes and terminates its process shortly after showing the system volume UI to avoid lingering.
```
