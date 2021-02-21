import React from 'react'
import { Line } from "react-chartjs-2";



const LineChart = ({ chartData }) => {
    const data = {
        labels: chartData.year_weeks,
        datasets: [
            {
                label: 'Cases/week',
                data: chartData.casesPerWeek,
                fill: false,
                backgroundColor: 'rgb(54, 162, 235)',
                borderColor: 'rgba(54, 162, 235, 0.2)',
                yAxisID: 'y-axis-1',
            },
            {
                label: 'Deaths/week',
                data: chartData.deathsPerWeek,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
                yAxisID: 'y-axis-1',
            },
        ],
    }

    const options = {
        scales: {
            yAxes: [
                {
                    type: 'linear',
                    display: true,
                    position: 'left',
                    id: 'y-axis-1',
                },
            ],
        },
    }
    return (
        <>
            <Line data={data} options={options} />
        </>
    )
}

export default LineChart