package com.appshed.store.entities;

import com.rightutils.rightutils.db.ColumnName;

import java.io.Serializable;

/**
 * Created by Anton Maniskevich on 8/8/14.
 */
public class App implements Serializable {

	private long id;
	private String name;
	private String description;
	private String zip;
	private String icon;
	private boolean ads;
	private int version;
	@ColumnName("featured_image")
	private String featuredImage;

	public App() {
	}

	public App(long id) {
		this.id = id;
	}

	public App(long id, String name, String description, String zip, String icon, boolean ads, int version, String featuredImage) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.zip = zip;
		this.icon = icon;
		this.ads = ads;
		this.version = version;
		this.featuredImage = featuredImage;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || ((Object) this).getClass() != o.getClass()) return false;

		App app = (App) o;

		if (id != app.id) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return (int) (id ^ (id >>> 32));
	}

	@Override
	public String toString() {
		return "App{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", zip='" + zip + '\'' +
				", icon='" + icon + '\'' +
				", ads=" + ads +
				", version=" + version +
				", featuredImage='" + featuredImage + '\'' +
				'}';
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isAds() {
		return ads;
	}

	public void setAds(boolean ads) {
		this.ads = ads;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getFeaturedImage() {
		return featuredImage;
	}

	public void setFeaturedImage(String featuredImage) {
		this.featuredImage = featuredImage;
	}
}
