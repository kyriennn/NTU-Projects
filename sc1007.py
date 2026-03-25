import matplotlib.pyplot as plt

x = [1, 2 ,3 ,4]
y = [10, 20, 25, 30]

plt.figure(figsize = (8, 5))

plt.plot(x, y, marker = 'o', linewidth = 2)

plt.title("Sales Trend", fontsize = 14)
plt.xlabel("Month")
plt.ylabel("Revenue")
plt.style.use('seaborn-v0_8')
plt.grid(True)
plt.tight_layout()

plt.show()