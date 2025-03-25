// src/pages/Dashboard.jsx
import React from 'react';

function Dashboard() {
  return (
    <div className="dashboard-container">
      <h1>Welcome to Your Dashboard</h1>
      <p>This is where you'll manage your freelance projects.</p>
      <div className="dashboard-summary">
        <div className="summary-card">
          <h3>Active Projects</h3>
          <p className="summary-value">0</p>
        </div>
        <div className="summary-card">
          <h3>Pending Invoices</h3>
          <p className="summary-value">0</p>
        </div>
        <div className="summary-card">
          <h3>Clients</h3>
          <p className="summary-value">0</p>
        </div>
      </div>
    </div>
  );
}

export default Dashboard;