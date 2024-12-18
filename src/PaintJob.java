public class PaintJob {
    public static void main(String[] args) {
        // Test cases for 4-parameter method
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); // Output: -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));  // Output: 3
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); // Output: 3

        // Test cases for 3-parameter method
        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); // Output: -1
        System.out.println(getBucketCount(3.4, 2.1, 1.5));  // Output: 5
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); // Output: 14

        // Test cases for 2-parameter method
        System.out.println(getBucketCount(3.4, 1.5));   // Output: 3
        System.out.println(getBucketCount(6.26, 2.2));  // Output: 3
        System.out.println(getBucketCount(3.26, 0.75)); // Output: 5
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = width * height;

        int bucketsNeeded = (int) Math.ceil(wallArea / areaPerBucket);

        int bucketsToBuy = bucketsNeeded - extraBuckets;

        return bucketsToBuy > 0 ? bucketsToBuy : 0;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double wallArea = width * height;

        return (int) Math.ceil(wallArea / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}
