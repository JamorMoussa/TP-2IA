import numpy as np
import matplotlib.pyplot as plt


def plot_2D(w, X, y, label="PLA"):
    fig = plt.figure()
    ax = fig.add_subplot(1, 1, 1)
    plt.scatter(X[:, 1], X[:, 2], marker="o", c=y)
    
    min_x0 = np.amin(X[:, 1])
    max_x1 = np.amax(X[:, 1])
    
    x = np.linspace(min_x0, max_x1, 100)

    y = (-w[1] * x - w[0]) / w[2]
    plt.plot(x, y, label=label)
    plt.legend()
    plt.show()