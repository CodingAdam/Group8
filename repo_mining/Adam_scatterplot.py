import Adam_authorsFileTouches
import numpy as np
import matplotlib.pyplot as plt
import datetime

# GitHub repo
repo = 'scottyab/rootbeer'
# repo = 'Skyscanner/backpack' # This repo is commit heavy. It takes long to finish executing
# repo = 'k9mail/k-9' # This repo is commit heavy. It takes long to finish executing
# repo = 'mendhak/gpslogger'


# put your tokens here
# Remember to empty the list when going to commit to GitHub.
# Otherwise they will all be reverted and you will have to re-create them
# I would advise to create more than one token for repos with heavy commits
lstTokens = ["not_real_digits"]

dictfiles = []
Adam_authorsFileTouches.countfiles(dictfiles, lstTokens, repo)

x_val = [x[0] for x in dictfiles]
y_val = [x[2] for x in dictfiles]
names = [x[1] for x in dictfiles]

fileNumberList = []
i = 0
for x in x_val:
    if not any(x in j for j in fileNumberList):
        fileNumberList.append((x, i))
        i = i + 1
        print((x, i))

numberList = []
for x in x_val:
    for f in fileNumberList:
        if x in f[0]:
            numberList.append(f[1])


weeksSinceList = []

last_date = datetime.date(int(y_val[-1][:4]), int(y_val[-1][5:7]), int(y_val[-1][8:10]))
for y in y_val:
    weeksSinceList.append(int((datetime.date(int(y[:4]), int(y[5:7]), int(y[8:10])) - last_date).days/7))

colors = [float(hash(s) % 256) / 256 for s in names]

plt.scatter(numberList, weeksSinceList, c=colors, s=50)
plt.show()
